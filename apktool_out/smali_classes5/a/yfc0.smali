.class public final La/yfc0;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/zo8;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/yfc0;",
        "La/stl;",
        "La/zo8;",
        "<init>",
        "()V",
        "a/xi70",
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
.field public static final l2:La/xi70;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public g2:La/fiu0;

.field public final h2:La/kiu0;

.field public final i2:La/nae0;

.field public final j2:La/a8z;

.field public final k2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/yfc0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/makebet_promocodes/impl/databinding/BottomSheetFragmentPromoCodesBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/yfc0;->m2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/xi70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/yfc0;->l2:La/xi70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/vfc0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/vfc0;-><init>(La/yfc0;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/g8b0;

    .line 11
    .line 12
    const/16 v2, 0xf

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/wez;->b:La/wez;

    .line 18
    .line 19
    new-instance v3, La/g8b0;

    .line 20
    .line 21
    const/16 v4, 0x10

    .line 22
    .line 23
    invoke-direct {v3, v1, v4}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-class v3, La/jhc0;

    .line 31
    .line 32
    sget-object v4, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v4, La/x6b0;

    .line 39
    .line 40
    const/16 v5, 0x12

    .line 41
    .line 42
    invoke-direct {v4, v1, v5}, La/x6b0;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v5, La/x6b0;

    .line 46
    .line 47
    const/16 v6, 0x13

    .line 48
    .line 49
    invoke-direct {v5, v1, v6}, La/x6b0;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/yfc0;->h2:La/kiu0;

    .line 57
    .line 58
    sget-object v0, La/wfc0;->a:La/wfc0;

    .line 59
    .line 60
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/yfc0;->i2:La/nae0;

    .line 65
    .line 66
    new-instance v0, La/vfc0;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {v0, p0, v1}, La/vfc0;-><init>(La/yfc0;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/yfc0;->j2:La/a8z;

    .line 77
    .line 78
    new-instance v0, La/phf0;

    .line 79
    .line 80
    const-string v1, "REQUEST_KEY"

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, La/yfc0;->k2:La/phf0;

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/yfc0;->V0()La/zo8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/yfc0;->V0()La/zo8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zo8;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v1, p0, La/yfc0;->j2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/tfc0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, La/wn8;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const v2, 0x7f08048a

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v0, v1, v2}, La/wn8;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/yfc0;->V0()La/zo8;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v1, v1, La/zo8;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, La/yfc0;->h2:La/kiu0;

    .line 45
    .line 46
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, La/jhc0;

    .line 51
    .line 52
    iget-object v1, v1, La/jhc0;->n:La/p7m0;

    .line 53
    .line 54
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v3, La/xfc0;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-direct {v3, p0, v5, v4}, La/xfc0;-><init>(La/yfc0;La/yje;B)V

    .line 63
    .line 64
    .line 65
    sget-object v4, La/lkz;->a:La/lkz;

    .line 66
    .line 67
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-static {v6}, La/x0x;->Q(La/glz;)La/tkz;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    new-instance v7, La/p8c0;

    .line 80
    .line 81
    invoke-direct {v7, v1, v4, v3, v5}, La/p8c0;-><init>(La/xae0;La/clz;La/xfc0;La/yje;)V

    .line 82
    .line 83
    .line 84
    const/4 v1, 0x3

    .line 85
    invoke-static {v6, v5, v5, v7, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/jhc0;

    .line 93
    .line 94
    iget-object v0, v0, La/jhc0;->o:La/ol60;

    .line 95
    .line 96
    new-instance v3, La/xfc0;

    .line 97
    .line 98
    invoke-direct {v3, p0, v5, v2}, La/xfc0;-><init>(La/yfc0;La/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    new-instance v4, La/p8c0;

    .line 114
    .line 115
    invoke-direct {v4, v0, p0, v3, v5}, La/p8c0;-><init>(La/gmq;La/clz;La/xfc0;La/yje;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2, v5, v5, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final T0()V
    .locals 9

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
    const-class v1, La/jgc0;

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
    instance-of v3, v0, La/jgc0;

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
    check-cast v2, La/jgc0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, v2, La/jgc0;->a:La/cad;

    .line 56
    .line 57
    iget-object v1, v2, La/jgc0;->b:La/ctf0;

    .line 58
    .line 59
    iget-object v3, v2, La/jgc0;->c:La/gst0;

    .line 60
    .line 61
    iget-object v4, v2, La/jgc0;->d:La/wsf0;

    .line 62
    .line 63
    iget-object v5, v2, La/jgc0;->e:La/lgc0;

    .line 64
    .line 65
    iget-object v6, v2, La/jgc0;->f:La/sue;

    .line 66
    .line 67
    iget-object v7, v2, La/jgc0;->g:La/m1e;

    .line 68
    .line 69
    iget-object v2, v2, La/jgc0;->h:La/iw20;

    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v8, La/g45;

    .line 87
    .line 88
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v5, v8, La/g45;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v1, v8, La/g45;->b:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v0, v8, La/g45;->c:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v6, v8, La/g45;->d:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v4, v8, La/g45;->e:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v3, v8, La/g45;->f:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v7, v8, La/g45;->g:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v2, v8, La/g45;->h:Ljava/lang/Object;

    .line 106
    .line 107
    new-instance v0, La/ppi;

    .line 108
    .line 109
    const/4 v1, 0x2

    .line 110
    invoke-direct {v0, v8, v1}, La/ppi;-><init>(Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    iput-object v0, v8, La/g45;->i:Ljava/lang/Object;

    .line 114
    .line 115
    new-instance v0, La/fiu0;

    .line 116
    .line 117
    iget-object v1, v8, La/g45;->i:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, La/ppi;

    .line 120
    .line 121
    const-class v2, La/jhc0;

    .line 122
    .line 123
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, La/yfc0;->g2:La/fiu0;

    .line 131
    .line 132
    return-void

    .line 133
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 134
    .line 135
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final V0()La/zo8;
    .locals 2

    .line 1
    sget-object v0, La/yfc0;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/yfc0;->i2:La/nae0;

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
    check-cast p0, La/zo8;

    .line 16
    .line 17
    return-object p0
.end method
