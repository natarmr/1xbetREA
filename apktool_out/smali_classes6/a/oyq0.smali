.class public final La/oyq0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La/v0h0;


# instance fields
.field public a:F

.field public final b:La/agk0;

.field public final c:La/agk0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/shq0;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/shq0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/t6q0;

    .line 9
    .line 10
    const/16 v2, 0x16

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/t6q0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, La/qxw;->L(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/v0h0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La/oyq0;->d:La/v0h0;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/oyq0;->a:F

    .line 5
    .line 6
    invoke-static {p3}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, La/oyq0;->b:La/agk0;

    .line 11
    .line 12
    invoke-static {p2}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La/oyq0;->c:La/agk0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 2

    .line 1
    iget v0, p0, La/oyq0;->a:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v0, v0, v1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, La/oyq0;->c:La/agk0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/agk0;->l()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget p0, p0, La/oyq0;->a:F

    .line 16
    .line 17
    div-float/2addr v0, p0

    .line 18
    return v0
.end method

.method public final b(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/oyq0;->b:La/agk0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/agk0;->m(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(F)V
    .locals 2

    .line 1
    iget v0, p0, La/oyq0;->a:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, La/l1e0;->c(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object p0, p0, La/oyq0;->c:La/agk0;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/agk0;->m(F)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
