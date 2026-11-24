.class public final La/y5d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/y5d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/y5d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/y5d;->a:La/y5d;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic c(La/y5d;La/mm40;)La/mm40;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, La/y5d;->b(La/mm40;Z)La/mm40;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method


# virtual methods
.method public final a(La/mm40;La/xx7;)La/mm40;
    .locals 0

    .line 1
    new-instance p0, La/wkw;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/wkw;-><init>(La/xx7;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final b(La/mm40;Z)La/mm40;
    .locals 0

    .line 1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
