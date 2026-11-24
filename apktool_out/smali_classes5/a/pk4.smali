.class public final La/pk4;
.super La/qw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/qw5<",
        "La/w3b0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/pk4;",
        "La/qw5;",
        "La/w3b0;",
        "<init>",
        "()V",
        "a/hfk0",
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


# static fields
.field public static final f2:La/hfk0;

.field public static final synthetic g2:[La/iiy;


# instance fields
.field public final b2:La/kiu0;

.field public c2:La/fiu0;

.field public d2:La/wdk0;

.field public final e2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/pk4;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/popular_classic/impl/databinding/PopularClassicAuthOfferDialogBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/pk4;->g2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/hfk0;

    .line 21
    .line 22
    const/16 v1, 0x1a

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/hfk0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/pk4;->f2:La/hfk0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/qw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/a13;

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/f80;

    .line 12
    .line 13
    invoke-direct {v2, p0, v1}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wez;->b:La/wez;

    .line 17
    .line 18
    new-instance v3, La/f80;

    .line 19
    .line 20
    const/16 v4, 0x1c

    .line 21
    .line 22
    invoke-direct {v3, v2, v4}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-class v2, La/hl4;

    .line 30
    .line 31
    sget-object v3, La/sre0;->a:La/tre0;

    .line 32
    .line 33
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, La/t51;

    .line 38
    .line 39
    const/16 v4, 0x12

    .line 40
    .line 41
    invoke-direct {v3, v1, v4}, La/t51;-><init>(La/a8z;B)V

    .line 42
    .line 43
    .line 44
    new-instance v4, La/t51;

    .line 45
    .line 46
    const/16 v5, 0x14

    .line 47
    .line 48
    invoke-direct {v4, v1, v5}, La/t51;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/pk4;->b2:La/kiu0;

    .line 56
    .line 57
    sget-object v0, La/lk4;->a:La/lk4;

    .line 58
    .line 59
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/pk4;->e2:La/nae0;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final B0()I
    .locals 0

    .line 1
    const p0, 0x7f1405a1

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic J0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/pk4;->Q0()La/w3b0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final M0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/pk4;->Q0()La/w3b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/w3b0;->e:Landroid/widget/Button;

    .line 6
    .line 7
    new-instance v1, La/jk4;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2}, La/jk4;-><init>(La/pk4;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/pk4;->Q0()La/w3b0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, La/w3b0;->b:Landroid/widget/ImageView;

    .line 21
    .line 22
    new-instance v1, La/jk4;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, p0, v2}, La/jk4;-><init>(La/pk4;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La/pk4;->Q0()La/w3b0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, La/w3b0;->d:Landroid/widget/Button;

    .line 36
    .line 37
    new-instance v1, La/jk4;

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    invoke-direct {v1, p0, v2}, La/jk4;-><init>(La/pk4;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final N0()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/sk4;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/sk4;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/sk4;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v1, v2, La/sk4;->b:La/uyu;

    .line 63
    .line 64
    iget-object v3, v2, La/sk4;->c:La/wyu;

    .line 65
    .line 66
    iget-object v4, v2, La/sk4;->d:La/duj;

    .line 67
    .line 68
    iget-object v5, v2, La/sk4;->e:La/kt2;

    .line 69
    .line 70
    iget-object v6, v2, La/sk4;->a:La/cad;

    .line 71
    .line 72
    iget-object v7, v2, La/sk4;->f:La/pru;

    .line 73
    .line 74
    iget-object v8, v2, La/sk4;->h:La/d1p;

    .line 75
    .line 76
    iget-object v2, v2, La/sk4;->g:La/wdk0;

    .line 77
    .line 78
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v9, La/g45;

    .line 91
    .line 92
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v3, v9, La/g45;->a:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v1, v9, La/g45;->b:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v5, v9, La/g45;->c:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v0, v9, La/g45;->d:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v4, v9, La/g45;->e:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v6, v9, La/g45;->f:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v8, v9, La/g45;->g:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v7, v9, La/g45;->h:Ljava/lang/Object;

    .line 110
    .line 111
    new-instance v0, La/n8i;

    .line 112
    .line 113
    const/4 v1, 0x6

    .line 114
    invoke-direct {v0, v9, v1}, La/n8i;-><init>(Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    iput-object v0, v9, La/g45;->i:Ljava/lang/Object;

    .line 118
    .line 119
    new-instance v0, La/fiu0;

    .line 120
    .line 121
    iget-object v1, v9, La/g45;->i:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, La/n8i;

    .line 124
    .line 125
    const-class v3, La/hl4;

    .line 126
    .line 127
    invoke-static {v3, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 132
    .line 133
    .line 134
    iput-object v0, p0, La/pk4;->c2:La/fiu0;

    .line 135
    .line 136
    iput-object v2, p0, La/pk4;->d2:La/wdk0;

    .line 137
    .line 138
    return-void

    .line 139
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 140
    .line 141
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final O0()I
    .locals 0

    .line 1
    const p0, 0x7f0a00cd

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final Q0()La/w3b0;
    .locals 2

    .line 1
    sget-object v0, La/pk4;->g2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/pk4;->e2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/w3b0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final R0()La/hl4;
    .locals 0

    .line 1
    iget-object p0, p0, La/pk4;->b2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/hl4;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/qw5;->K0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, La/qw5;->K0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/qw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/pk4;->R0()La/hl4;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, La/hl4;->g:La/p7m0;

    .line 12
    .line 13
    new-instance p2, La/nk4;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-direct {p2, p0, v5, v0}, La/nk4;-><init>(La/pk4;La/yje;B)V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/lkz;->a:La/lkz;

    .line 21
    .line 22
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, La/ac4;

    .line 35
    .line 36
    invoke-direct {v2, p1, v0, p2, v5}, La/ac4;-><init>(La/gmq;La/clz;La/nk4;La/yje;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x3

    .line 40
    invoke-static {v1, v5, v5, v2, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, La/pk4;->R0()La/hl4;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iget-object v2, p2, La/hl4;->h:La/p7m0;

    .line 48
    .line 49
    new-instance v4, La/nk4;

    .line 50
    .line 51
    const/4 p2, 0x1

    .line 52
    invoke-direct {v4, p0, v5, p2}, La/nk4;-><init>(La/pk4;La/yje;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance v1, La/ac4;

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    invoke-direct/range {v1 .. v6}, La/ac4;-><init>(La/gmq;La/clz;La/nk4;La/yje;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v5, v5, v1, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/pk4;->R0()La/hl4;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p1, p0, La/hl4;->b:La/kt2;

    .line 9
    .line 10
    const-string v0, "popup_enter_miss_click"

    .line 11
    .line 12
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/hl4;->f:La/ix0;

    .line 16
    .line 17
    iget-object p0, p0, La/ix0;->a:La/s1p;

    .line 18
    .line 19
    const-wide/16 v0, 0xc3d

    .line 20
    .line 21
    sget-object p1, La/xun;->a:La/xun;

    .line 22
    .line 23
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
