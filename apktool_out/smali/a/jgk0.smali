.class public abstract synthetic La/jgk0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/nvu;

.field public static final b:La/nvu;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/nvu;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/nvu;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/jgk0;->a:La/nvu;

    .line 9
    .line 10
    new-instance v0, La/nvu;

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/nvu;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/jgk0;->b:La/nvu;

    .line 16
    .line 17
    return-void
.end method

.method public static final a()La/xz40;
    .locals 3

    .line 1
    sget-object v0, La/jgk0;->b:La/nvu;

    .line 2
    .line 3
    invoke-virtual {v0}, La/nvu;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/xz40;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, La/xz40;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v2, v2, [La/eet;

    .line 15
    .line 16
    invoke-direct {v1, v2}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/nvu;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v1
.end method

.method public static final b(Lkotlin/jvm/functions/Function0;)La/zbk;
    .locals 2

    .line 1
    new-instance v0, La/zbk;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, La/zbk;-><init>(Lkotlin/jvm/functions/Function0;La/igk0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
