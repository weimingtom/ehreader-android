package tw.skyarrow.ehreader.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import tw.skyarrow.ehreader.db.Photo;
import tw.skyarrow.ehreader.db.ImageSearch;
import tw.skyarrow.ehreader.db.Gallery;
import tw.skyarrow.ehreader.db.Download;

import tw.skyarrow.ehreader.db.PhotoDao;
import tw.skyarrow.ehreader.db.ImageSearchDao;
import tw.skyarrow.ehreader.db.GalleryDao;
import tw.skyarrow.ehreader.db.DownloadDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig photoDaoConfig;
    private final DaoConfig imageSearchDaoConfig;
    private final DaoConfig galleryDaoConfig;
    private final DaoConfig downloadDaoConfig;

    private final PhotoDao photoDao;
    private final ImageSearchDao imageSearchDao;
    private final GalleryDao galleryDao;
    private final DownloadDao downloadDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        photoDaoConfig = daoConfigMap.get(PhotoDao.class).clone();
        photoDaoConfig.initIdentityScope(type);

        imageSearchDaoConfig = daoConfigMap.get(ImageSearchDao.class).clone();
        imageSearchDaoConfig.initIdentityScope(type);

        galleryDaoConfig = daoConfigMap.get(GalleryDao.class).clone();
        galleryDaoConfig.initIdentityScope(type);

        downloadDaoConfig = daoConfigMap.get(DownloadDao.class).clone();
        downloadDaoConfig.initIdentityScope(type);

        photoDao = new PhotoDao(photoDaoConfig, this);
        imageSearchDao = new ImageSearchDao(imageSearchDaoConfig, this);
        galleryDao = new GalleryDao(galleryDaoConfig, this);
        downloadDao = new DownloadDao(downloadDaoConfig, this);

        registerDao(Photo.class, photoDao);
        registerDao(ImageSearch.class, imageSearchDao);
        registerDao(Gallery.class, galleryDao);
        registerDao(Download.class, downloadDao);
    }
    
    public void clear() {
        photoDaoConfig.getIdentityScope().clear();
        imageSearchDaoConfig.getIdentityScope().clear();
        galleryDaoConfig.getIdentityScope().clear();
        downloadDaoConfig.getIdentityScope().clear();
    }

    public PhotoDao getPhotoDao() {
        return photoDao;
    }

    public ImageSearchDao getImageSearchDao() {
        return imageSearchDao;
    }

    public GalleryDao getGalleryDao() {
        return galleryDao;
    }

    public DownloadDao getDownloadDao() {
        return downloadDao;
    }

}
