.class public final Lorg/xplatform/personal/impl/presentation/edit/n;
.super La/w3k;
.source "SourceFile"


# static fields
.field public static final v:La/sdj;


# instance fields
.field public final synthetic c:La/xzb0;

.field public final synthetic d:La/nqs;

.field public final e:La/bzt;

.field public final f:La/pru;

.field public final g:La/rou;

.field public final h:La/iqi;

.field public final i:La/duj;

.field public final j:La/i1w0;

.field public final k:La/mne;

.field public final l:La/zg;

.field public final m:La/au0;

.field public final n:La/vzg0;

.field public final o:La/n0o0;

.field public final p:La/xae0;

.field public final q:La/ol60;

.field public final r:Ljava/util/LinkedHashMap;

.field public final s:La/p7m0;

.field public t:I

.field public final u:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/sdj;->b:La/sdj;

    .line 2
    .line 3
    sput-object v0, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(La/bzt;La/pru;La/rou;La/iqi;La/duj;La/i1w0;La/mne;Ljava/lang/String;La/zg;La/au0;La/vzg0;La/xzb0;La/nqs;)V
    .locals 2

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p8, 0x2

    .line 5
    new-array p8, p8, [La/eiu0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    aput-object p12, p8, v0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aput-object p13, p8, v1

    .line 12
    .line 13
    invoke-static {p8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p8

    .line 17
    invoke-direct {p0, p11, p8}, La/w3k;-><init>(La/vzg0;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    iput-object p12, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->c:La/xzb0;

    .line 21
    .line 22
    iput-object p13, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->d:La/nqs;

    .line 23
    .line 24
    iput-object p1, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->e:La/bzt;

    .line 25
    .line 26
    iput-object p2, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->f:La/pru;

    .line 27
    .line 28
    iput-object p3, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->g:La/rou;

    .line 29
    .line 30
    iput-object p4, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->h:La/iqi;

    .line 31
    .line 32
    iput-object p5, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->i:La/duj;

    .line 33
    .line 34
    iput-object p6, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->j:La/i1w0;

    .line 35
    .line 36
    iput-object p7, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->k:La/mne;

    .line 37
    .line 38
    iput-object p9, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->l:La/zg;

    .line 39
    .line 40
    iput-object p10, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->m:La/au0;

    .line 41
    .line 42
    iput-object p11, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->n:La/vzg0;

    .line 43
    .line 44
    new-instance p1, La/d2c0;

    .line 45
    .line 46
    invoke-direct {p1, p0, v0}, La/d2c0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->o:La/n0o0;

    .line 54
    .line 55
    const-string p1, "UI_STATE_KEY"

    .line 56
    .line 57
    sget-object p2, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loading;->a:Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loading;

    .line 58
    .line 59
    invoke-virtual {p11, p2, p1}, La/vzg0;->c(Ljava/lang/Object;Ljava/lang/String;)La/xae0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->p:La/xae0;

    .line 64
    .line 65
    new-instance p2, La/ol60;

    .line 66
    .line 67
    const/4 p3, 0x3

    .line 68
    invoke-direct {p2, p3}, La/ol60;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iput-object p2, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->q:La/ol60;

    .line 72
    .line 73
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p2, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->r:Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    iput-object p2, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->s:La/p7m0;

    .line 87
    .line 88
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p2, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->u:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    new-instance p2, Lorg/xplatform/personal/impl/presentation/edit/b;

    .line 96
    .line 97
    const/4 p3, 0x0

    .line 98
    invoke-direct {p2, p0, p3}, Lorg/xplatform/personal/impl/presentation/edit/b;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/yje;)V

    .line 99
    .line 100
    .line 101
    new-instance p4, La/fnq;

    .line 102
    .line 103
    const/4 p5, 0x4

    .line 104
    invoke-direct {p4, p1, p2, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 105
    .line 106
    .line 107
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance p2, La/e2c0;

    .line 112
    .line 113
    invoke-direct {p2, p0, p3, v0}, La/e2c0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/yje;B)V

    .line 114
    .line 115
    .line 116
    invoke-static {p4, p1, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public static z(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/w2c0;)Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of p1, p0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method


# virtual methods
.method public final A(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lorg/xplatform/personal/impl/presentation/edit/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/i;

    .line 7
    .line 8
    iget v1, v0, Lorg/xplatform/personal/impl/presentation/edit/i;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lorg/xplatform/personal/impl/presentation/edit/i;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lorg/xplatform/personal/impl/presentation/edit/i;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lorg/xplatform/personal/impl/presentation/edit/i;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lorg/xplatform/personal/impl/presentation/edit/i;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, Lorg/xplatform/personal/impl/presentation/edit/i;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v4

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p2, La/w2c0;->k:La/w2c0;

    .line 51
    .line 52
    invoke-static {p1, p2}, Lorg/xplatform/personal/impl/presentation/edit/n;->z(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/w2c0;)Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iget p1, p1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->b:I

    .line 59
    .line 60
    new-instance v4, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-direct {v4, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 63
    .line 64
    .line 65
    :cond_3
    if-eqz v4, :cond_4

    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_4
    iput v3, v0, Lorg/xplatform/personal/impl/presentation/edit/i;->k:I

    .line 69
    .line 70
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->g:La/rou;

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    invoke-virtual {p0, p1, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v1, :cond_5

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_5
    :goto_1
    check-cast p2, La/m2c0;

    .line 81
    .line 82
    iget p0, p2, La/m2c0;->g:I

    .line 83
    .line 84
    new-instance p1, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 87
    .line 88
    .line 89
    return-object p1
.end method

.method public final B()Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->p:La/xae0;

    .line 2
    .line 3
    iget-object p0, p0, La/xae0;->a:La/n7m0;

    .line 4
    .line 5
    invoke-interface {p0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;

    .line 10
    .line 11
    return-object p0
.end method

.method public final C()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->t:I

    .line 3
    .line 4
    const-string v1, "ORIGINAL_UI_STATE_HASH_KEY"

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object v3, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->n:La/vzg0;

    .line 8
    .line 9
    invoke-virtual {v3, v1, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->j:La/i1w0;

    .line 13
    .line 14
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, La/c8d;

    .line 19
    .line 20
    sget-object v3, La/y7d;->a:La/v7d;

    .line 21
    .line 22
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 23
    .line 24
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2, p0, v1, v0}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    move-object v1, v0

    .line 32
    check-cast v1, La/paw;

    .line 33
    .line 34
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/oe50;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-void
.end method

.method public final D(La/k2c0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->q:La/ol60;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final E(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->n:La/vzg0;

    .line 2
    .line 3
    const-string v0, "UI_STATE_KEY"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final w(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lorg/xplatform/personal/impl/presentation/edit/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/f;

    .line 7
    .line 8
    iget v1, v0, Lorg/xplatform/personal/impl/presentation/edit/f;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lorg/xplatform/personal/impl/presentation/edit/f;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lorg/xplatform/personal/impl/presentation/edit/f;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lorg/xplatform/personal/impl/presentation/edit/f;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lorg/xplatform/personal/impl/presentation/edit/f;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, Lorg/xplatform/personal/impl/presentation/edit/f;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v4

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p2, La/w2c0;->l:La/w2c0;

    .line 51
    .line 52
    invoke-static {p1, p2}, Lorg/xplatform/personal/impl/presentation/edit/n;->z(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/w2c0;)Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iget p1, p1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->b:I

    .line 59
    .line 60
    new-instance v4, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-direct {v4, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 63
    .line 64
    .line 65
    :cond_3
    if-eqz v4, :cond_4

    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_4
    iput v3, v0, Lorg/xplatform/personal/impl/presentation/edit/f;->k:I

    .line 69
    .line 70
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->g:La/rou;

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    invoke-virtual {p0, p1, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v1, :cond_5

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_5
    :goto_1
    check-cast p2, La/m2c0;

    .line 81
    .line 82
    iget p0, p2, La/m2c0;->d:I

    .line 83
    .line 84
    new-instance p1, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 87
    .line 88
    .line 89
    return-object p1
.end method

.method public final x(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lorg/xplatform/personal/impl/presentation/edit/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/g;

    .line 7
    .line 8
    iget v1, v0, Lorg/xplatform/personal/impl/presentation/edit/g;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lorg/xplatform/personal/impl/presentation/edit/g;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lorg/xplatform/personal/impl/presentation/edit/g;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lorg/xplatform/personal/impl/presentation/edit/g;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lorg/xplatform/personal/impl/presentation/edit/g;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, Lorg/xplatform/personal/impl/presentation/edit/g;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v4

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p2, La/w2c0;->j:La/w2c0;

    .line 51
    .line 52
    invoke-static {p1, p2}, Lorg/xplatform/personal/impl/presentation/edit/n;->z(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/w2c0;)Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iget p1, p1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->b:I

    .line 59
    .line 60
    new-instance v4, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-direct {v4, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 63
    .line 64
    .line 65
    :cond_3
    if-eqz v4, :cond_4

    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_4
    iput v3, v0, Lorg/xplatform/personal/impl/presentation/edit/g;->k:I

    .line 69
    .line 70
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->g:La/rou;

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    invoke-virtual {p0, p1, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v1, :cond_5

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_5
    :goto_1
    check-cast p2, La/m2c0;

    .line 81
    .line 82
    iget-object p0, p2, La/m2c0;->c:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eqz p0, :cond_6

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    goto :goto_2

    .line 95
    :cond_6
    const/4 p0, -0x1

    .line 96
    :goto_2
    new-instance p1, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 99
    .line 100
    .line 101
    return-object p1
.end method

.method public final y(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lorg/xplatform/personal/impl/presentation/edit/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/h;

    .line 7
    .line 8
    iget v1, v0, Lorg/xplatform/personal/impl/presentation/edit/h;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lorg/xplatform/personal/impl/presentation/edit/h;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lorg/xplatform/personal/impl/presentation/edit/h;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lorg/xplatform/personal/impl/presentation/edit/h;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lorg/xplatform/personal/impl/presentation/edit/h;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, Lorg/xplatform/personal/impl/presentation/edit/h;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v4

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p2, La/w2c0;->n:La/w2c0;

    .line 51
    .line 52
    invoke-static {p1, p2}, Lorg/xplatform/personal/impl/presentation/edit/n;->z(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/w2c0;)Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iget p1, p1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->b:I

    .line 59
    .line 60
    new-instance v4, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-direct {v4, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 63
    .line 64
    .line 65
    :cond_3
    if-eqz v4, :cond_4

    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_4
    iput v3, v0, Lorg/xplatform/personal/impl/presentation/edit/h;->k:I

    .line 69
    .line 70
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/n;->g:La/rou;

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    invoke-virtual {p0, p1, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v1, :cond_5

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_5
    :goto_1
    check-cast p2, La/m2c0;

    .line 81
    .line 82
    iget p0, p2, La/m2c0;->F:I

    .line 83
    .line 84
    new-instance p1, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 87
    .line 88
    .line 89
    return-object p1
.end method
