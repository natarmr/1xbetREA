.class public abstract La/h7z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/z6k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, La/hic;->g()La/z6k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, La/h7z;->a:La/z6k;

    .line 6
    .line 7
    return-void
.end method

.method public static final a(La/e7z;)La/cg80;
    .locals 0

    .line 1
    iget-object p0, p0, La/e7z;->o:La/cg80;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "LayoutNode should be attached to an owner"

    .line 7
    .line 8
    invoke-static {p0}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    throw p0
.end method
