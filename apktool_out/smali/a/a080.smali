.class public final La/a080;
.super La/mjq;
.source "SourceFile"


# static fields
.field public static final d:La/a080;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/a080;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, La/mjq;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/a080;->d:La/a080;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final d(La/hu5;La/bv3;La/t9k0;La/pwi;La/s080;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, La/hu5;->g(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, La/tld;

    .line 7
    .line 8
    const/4 p4, 0x2

    .line 9
    invoke-virtual {p1, p4}, La/hu5;->g(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    check-cast p4, La/mu40;

    .line 14
    .line 15
    const/4 p5, 0x1

    .line 16
    invoke-virtual {p1, p5}, La/hu5;->g(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, La/nld;

    .line 21
    .line 22
    const/4 p5, 0x0

    .line 23
    invoke-static {p0, p4, p3, p5}, La/ykd;->c(La/tld;La/mu40;La/t9k0;La/bv3;)La/lu40;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p1, p4, p0, p2}, La/nld;->o(La/mu40;La/lu40;La/bv3;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
