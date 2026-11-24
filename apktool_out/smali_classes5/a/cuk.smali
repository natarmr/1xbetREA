.class public final La/cuk;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/mik;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/cuk;",
        "La/nw5;",
        "La/mik;",
        "<init>",
        "()V",
        "a/bek",
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
.field public static final l2:La/bek;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public e2:La/kfi;

.field public final f2:La/nae0;

.field public final g2:La/kiu0;

.field public final h2:La/n0o0;

.field public final i2:La/n0o0;

.field public final j2:La/zz2;

.field public final k2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/cuk;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/special_event/impl/databinding/DialogDisciplinePickerBinding;"

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
    const-string v3, "eventId"

    .line 16
    .line 17
    const-string v5, "getEventId()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "selectedDiscipline"

    .line 25
    .line 26
    const-string v6, "getSelectedDiscipline()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/cuk;->m2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/bek;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/cuk;->l2:La/bek;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/buk;->a:La/buk;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/cuk;->f2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/auk;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, La/auk;-><init>(La/cuk;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/v9k;

    .line 19
    .line 20
    const/16 v2, 0x13

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/v9k;

    .line 28
    .line 29
    const/16 v4, 0x14

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/guk;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/b9k;

    .line 47
    .line 48
    const/16 v4, 0xa

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/b9k;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/b9k;

    .line 54
    .line 55
    const/16 v5, 0xb

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/b9k;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/cuk;->g2:La/kiu0;

    .line 65
    .line 66
    new-instance v0, La/auk;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {v0, p0, v1}, La/auk;-><init>(La/cuk;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/cuk;->h2:La/n0o0;

    .line 77
    .line 78
    new-instance v0, La/auk;

    .line 79
    .line 80
    const/4 v1, 0x2

    .line 81
    invoke-direct {v0, p0, v1}, La/auk;-><init>(La/cuk;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, La/cuk;->i2:La/n0o0;

    .line 89
    .line 90
    new-instance v0, La/zz2;

    .line 91
    .line 92
    const-string v1, "SPECIAL_EVENT_ID_BUNDLE_KEY"

    .line 93
    .line 94
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, La/cuk;->j2:La/zz2;

    .line 98
    .line 99
    new-instance v0, La/phf0;

    .line 100
    .line 101
    const-string v1, "SELECTED_DISCIPLINE_ID_BUNDLE_KEY"

    .line 102
    .line 103
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, La/cuk;->k2:La/phf0;

    .line 107
    .line 108
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

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/cuk;->T0()La/mik;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final P0()V
    .locals 15

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
    const-class v1, La/ztk;

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
    instance-of v3, v0, La/ztk;

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
    check-cast v2, La/ztk;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    sget-object v1, La/cuk;->m2:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v1, v0

    .line 59
    .line 60
    iget-object v3, p0, La/cuk;->j2:La/zz2;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    const/4 v0, 0x2

    .line 67
    aget-object v0, v1, v0

    .line 68
    .line 69
    iget-object v1, p0, La/cuk;->k2:La/phf0;

    .line 70
    .line 71
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    const-class v0, La/cuk;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v10, v2, La/ztk;->a:La/ygm0;

    .line 85
    .line 86
    iget-object v11, v2, La/ztk;->b:La/knf0;

    .line 87
    .line 88
    iget-object v13, v2, La/ztk;->c:La/gii0;

    .line 89
    .line 90
    iget-object v12, v2, La/ztk;->d:La/g2v;

    .line 91
    .line 92
    iget-object v5, v2, La/ztk;->e:La/cad;

    .line 93
    .line 94
    iget-object v6, v2, La/ztk;->f:La/d1p;

    .line 95
    .line 96
    iget-object v14, v2, La/ztk;->g:La/yo4;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v4, La/o3c;

    .line 111
    .line 112
    invoke-direct/range {v4 .. v14}, La/o3c;-><init>(La/cad;La/d1p;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;La/ygm0;La/knf0;La/g2v;La/gii0;La/yo4;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v4, La/o3c;->k:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, La/n5d0;

    .line 118
    .line 119
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, La/kfi;

    .line 124
    .line 125
    iput-object v0, p0, La/cuk;->e2:La/kfi;

    .line 126
    .line 127
    return-void

    .line 128
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 129
    .line 130
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0454

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final T0()La/mik;
    .locals 2

    .line 1
    sget-object v0, La/cuk;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/cuk;->f2:La/nae0;

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
    check-cast p0, La/mik;

    .line 16
    .line 17
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    iput-boolean p2, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 p2, 0x3

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object p1, p0, La/cuk;->g2:La/kiu0;

    .line 27
    .line 28
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, La/guk;

    .line 33
    .line 34
    iget-object p1, p1, La/guk;->h:La/p7m0;

    .line 35
    .line 36
    new-instance v1, La/i89;

    .line 37
    .line 38
    const/16 v0, 0x11

    .line 39
    .line 40
    invoke-direct {v1, p1, v0}, La/i89;-><init>(La/gmq;B)V

    .line 41
    .line 42
    .line 43
    new-instance v3, La/e9g;

    .line 44
    .line 45
    const/16 p1, 0x1c

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {v3, p0, v4, p1}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 49
    .line 50
    .line 51
    sget-object p1, La/lkz;->a:La/lkz;

    .line 52
    .line 53
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v0, La/xsj;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-direct/range {v0 .. v5}, La/xsj;-><init>(La/i89;La/clz;La/e9g;La/yje;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v4, v4, v0, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/cuk;->T0()La/mik;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p1, p1, La/mik;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 79
    .line 80
    iget-object p2, p0, La/cuk;->h2:La/n0o0;

    .line 81
    .line 82
    invoke-virtual {p2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, La/qnk;

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, La/cuk;->T0()La/mik;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object p1, p1, La/mik;->d:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 96
    .line 97
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object p2, p0, La/cuk;->i2:La/n0o0;

    .line 102
    .line 103
    invoke-virtual {p2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    check-cast p2, Landroid/view/View$OnFocusChangeListener;

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, La/cuk;->T0()La/mik;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object p1, p1, La/mik;->d:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 117
    .line 118
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    new-instance p2, La/jt6;

    .line 123
    .line 124
    const/4 v0, 0x6

    .line 125
    invoke-direct {p2, p0, v0}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method
