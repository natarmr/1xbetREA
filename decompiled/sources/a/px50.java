package a;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: classes.dex */
public final class px50 extends ggy {
    public static Long F(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // a.yzp
    public final void c(y190 y190Var, y190 y190Var2) throws IOException {
        y190Var.getClass();
        y190Var2.getClass();
        try {
            Path path = Paths.get(y190Var.f41844a.x(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(y190Var2.f41844a.x(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            ohq.l("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // a.ggy
    public final String toString() {
        return "NioSystemFileSystem";
    }

    @Override // a.yzp
    public final h7k v(y190 y190Var) {
        y190 y190VarB;
        y190Var.getClass();
        Path path = Paths.get(y190Var.f41844a.x(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = y190.b;
                y190VarB = rl70.b(symbolicLink.toString());
            } else {
                y190VarB = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lF = fileTimeCreationTime != null ? F(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lF2 = fileTimeLastModifiedTime != null ? F(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new h7k(zIsRegularFile, zIsDirectory, y190VarB, lValueOf, lF, lF2, fileTimeLastAccessTime != null ? F(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
