.class public final La/yog;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La/v0h0;


# instance fields
.field public a:I

.field public final b:La/agk0;

.field public final c:La/xog;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/jyf;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/jyf;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/vlf;

    .line 9
    .line 10
    const/16 v2, 0x14

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/vlf;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/v0h0;

    .line 16
    .line 17
    invoke-direct {v2, v1, v0}, La/v0h0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    sput-object v2, La/yog;->d:La/v0h0;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, La/yog;->b:La/agk0;

    .line 9
    .line 10
    new-instance p1, La/xog;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p1, p0, v0}, La/xog;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/yog;->c:La/xog;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 3

    .line 1
    iget v0, p0, La/yog;->a:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    cmpg-float v2, v0, v1

    .line 6
    .line 7
    if-gtz v2, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    iget-object p0, p0, La/yog;->b:La/agk0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/agk0;->l()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {v2, v1, v0}, La/l1e0;->c(FFF)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sub-float p1, v2, p1

    .line 21
    .line 22
    invoke-static {p1, v1, v0}, La/l1e0;->c(FFF)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, La/agk0;->m(F)V

    .line 27
    .line 28
    .line 29
    sub-float/2addr v2, p1

    .line 30
    return v2
.end method
