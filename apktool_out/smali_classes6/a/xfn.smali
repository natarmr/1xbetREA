.class public abstract La/xfn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/dcn;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/dcn;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/xfn;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(La/fet;)La/wfn;
    .locals 1

    .line 1
    sget-object v0, La/dy2;->a:La/zfn;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/res/Configuration;

    .line 8
    .line 9
    iget p0, p0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 10
    .line 11
    const/16 v0, 0x258

    .line 12
    .line 13
    if-ge p0, v0, :cond_0

    .line 14
    .line 15
    sget-object p0, La/yfn;->g:La/yfn;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, La/yfn;->h:La/yfn;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final b(Z)La/wfn;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, La/yfn;->h:La/yfn;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, La/yfn;->g:La/yfn;

    .line 7
    .line 8
    return-object p0
.end method
