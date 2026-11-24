.class public final La/e080;
.super La/mjq;
.source "SourceFile"


# static fields
.field public static final d:La/e080;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/e080;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2, v1}, La/mjq;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/e080;->d:La/e080;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(La/hu5;La/bv3;La/t9k0;La/pwi;La/s080;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, La/hu5;->f(I)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    const/4 p3, 0x1

    .line 7
    invoke-virtual {p1, p3}, La/hu5;->f(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-interface {p2, p0, p1}, La/bv3;->b(II)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
