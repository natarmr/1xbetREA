.class public final La/cp10;
.super La/y960;
.source "SourceFile"


# static fields
.field public static final d:La/z960;


# instance fields
.field public b:F

.field public c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/cp10;

    .line 2
    .line 3
    invoke-direct {v0}, La/cp10;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    invoke-static {v1, v0}, La/z960;->a(ILa/y960;)La/z960;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, La/cp10;->d:La/z960;

    .line 13
    .line 14
    const/high16 v1, 0x3f000000    # 0.5f

    .line 15
    .line 16
    iput v1, v0, La/z960;->f:F

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/y960;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, La/cp10;->b:F

    .line 6
    .line 7
    iput v0, p0, La/cp10;->c:F

    .line 8
    .line 9
    return-void
.end method

.method public static b(FF)La/cp10;
    .locals 1

    .line 1
    sget-object v0, La/cp10;->d:La/z960;

    .line 2
    .line 3
    invoke-virtual {v0}, La/z960;->b()La/y960;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/cp10;

    .line 8
    .line 9
    iput p0, v0, La/cp10;->b:F

    .line 10
    .line 11
    iput p1, v0, La/cp10;->c:F

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public final a()La/y960;
    .locals 0

    .line 1
    new-instance p0, La/cp10;

    .line 2
    .line 3
    invoke-direct {p0}, La/cp10;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
