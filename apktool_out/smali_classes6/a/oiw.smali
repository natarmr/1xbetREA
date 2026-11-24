.class public final La/oiw;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/oiw;",
        "La/yx5;",
        "<init>",
        "()V",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ujd;

.field public final M1:La/a8z;

.field public final N1:La/a8z;

.field public final O1:La/qdz;

.field public final P1:Z

.field public final Q1:La/e9o0;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/liw;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/liw;-><init>(La/oiw;B)V

    .line 11
    .line 12
    .line 13
    sget-object v1, La/wez;->b:La/wez;

    .line 14
    .line 15
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/oiw;->M1:La/a8z;

    .line 20
    .line 21
    const-class v0, La/tkw;

    .line 22
    .line 23
    sget-object v1, La/sre0;->a:La/tre0;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, La/liw;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v1, p0, v2}, La/liw;-><init>(La/oiw;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, La/oiw;->N1:La/a8z;

    .line 40
    .line 41
    new-instance v0, La/qdz;

    .line 42
    .line 43
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/oiw;->O1:La/qdz;

    .line 47
    .line 48
    iput-boolean v2, p0, La/oiw;->P1:Z

    .line 49
    .line 50
    new-instance v0, La/e9o0;

    .line 51
    .line 52
    const v1, 0x7f040ae3

    .line 53
    .line 54
    .line 55
    const/16 v2, 0xc

    .line 56
    .line 57
    const v3, 0x7f040b5d

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, La/oiw;->Q1:La/e9o0;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/oiw;->M1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/xii;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/tkw;

    .line 12
    .line 13
    iget-object v3, v0, La/xii;->B:La/rii;

    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, La/oiw;->K1:La/fiu0;

    .line 23
    .line 24
    iget-object v0, v0, La/xii;->r:La/itr;

    .line 25
    .line 26
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/oiw;->L1:La/ujd;

    .line 34
    .line 35
    return-void
.end method

.method public final D0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/oiw;->L1:La/ujd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La/ls2;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, La/adw;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, p0, v3}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "composeGameCardFragmentDelegate"

    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/yx5;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/oiw;->M1:La/a8z;

    .line 5
    .line 6
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, La/xii;

    .line 11
    .line 12
    new-instance v0, La/fiu0;

    .line 13
    .line 14
    const-class v1, La/tkw;

    .line 15
    .line 16
    iget-object v2, p1, La/xii;->B:La/rii;

    .line 17
    .line 18
    invoke-static {v1, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, La/oiw;->K1:La/fiu0;

    .line 26
    .line 27
    iget-object p1, p1, La/xii;->r:La/itr;

    .line 28
    .line 29
    invoke-interface {p1}, La/itr;->d()La/ujd;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, La/oiw;->L1:La/ujd;

    .line 37
    .line 38
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 p3, 0x6

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p2, v0, p3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, La/owp0;

    .line 16
    .line 17
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 18
    .line 19
    .line 20
    new-instance p3, La/xxv;

    .line 21
    .line 22
    const/4 v1, 0x5

    .line 23
    invoke-direct {p3, p0, v1}, La/xxv;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v1, 0x6c8094ec

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {p0, v1, v2, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/oiw;->P1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/oiw;->Q1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
