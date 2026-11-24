.class public final La/pd3;
.super La/hd3;
.source "SourceFile"

# interfaces
.implements La/mx30;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final G1:La/nuj0;

.field public static final H1:[I

.field public static final I1:Z


# instance fields
.field public A:Landroid/widget/TextView;

.field public A1:Z

.field public B:Z

.field public B1:Landroid/graphics/Rect;

.field public C1:Landroid/graphics/Rect;

.field public D1:La/ye3;

.field public E1:Landroid/window/OnBackInvokedDispatcher;

.field public F1:La/ma3;

.field public Y:Z

.field public Z:Z

.field public f1:Z

.field public g1:Z

.field public h1:Z

.field public i1:Z

.field public final j:Ljava/lang/Object;

.field public j1:Z

.field public final k:Landroid/content/Context;

.field public k1:[La/od3;

.field public l:Landroid/view/Window;

.field public l1:La/od3;

.field public m:La/kd3;

.field public m1:Z

.field public n:La/qhv0;

.field public n1:Z

.field public o:La/njn0;

.field public o1:Z

.field public p:Ljava/lang/CharSequence;

.field public p1:Z

.field public q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public q1:Landroid/content/res/Configuration;

.field public r:La/wsf0;

.field public final r1:I

.field public s:La/r7v;

.field public s1:I

.field public t:La/xj;

.field public t1:I

.field public u:Landroidx/appcompat/widget/ActionBarContextView;

.field public u1:Z

.field public v:Landroid/widget/PopupWindow;

.field public v1:La/ld3;

.field public w:La/id3;

.field public w1:La/ld3;

.field public x:La/zju0;

.field public x1:Z

.field public y:Z

.field public y1:I

.field public z:Landroid/view/ViewGroup;

.field public final z1:La/id3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/nuj0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/nuj0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/pd3;->G1:La/nuj0;

    .line 8
    .line 9
    const v0, 0x1010054

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, La/pd3;->H1:[I

    .line 17
    .line 18
    const-string v0, "robolectric"

    .line 19
    .line 20
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    xor-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    sput-boolean v0, La/pd3;->I1:Z

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;La/bd3;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    iput-object p3, p0, La/pd3;->x:La/zju0;

    .line 6
    .line 7
    const/16 v0, -0x64

    .line 8
    .line 9
    iput v0, p0, La/pd3;->r1:I

    .line 10
    .line 11
    new-instance v1, La/id3;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p0, v2}, La/id3;-><init>(La/pd3;B)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/pd3;->z1:La/id3;

    .line 18
    .line 19
    iput-object p1, p0, La/pd3;->k:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p4, p0, La/pd3;->j:Ljava/lang/Object;

    .line 22
    .line 23
    instance-of p4, p4, Landroid/app/Dialog;

    .line 24
    .line 25
    if-eqz p4, :cond_2

    .line 26
    .line 27
    :goto_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    instance-of p4, p1, La/yc3;

    .line 30
    .line 31
    if-eqz p4, :cond_0

    .line 32
    .line 33
    move-object p3, p1

    .line 34
    check-cast p3, La/yc3;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    instance-of p4, p1, Landroid/content/ContextWrapper;

    .line 38
    .line 39
    if-eqz p4, :cond_1

    .line 40
    .line 41
    check-cast p1, Landroid/content/ContextWrapper;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :goto_1
    if-eqz p3, :cond_2

    .line 49
    .line 50
    invoke-virtual {p3}, La/yc3;->t()La/hd3;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, La/hd3;->j()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput p1, p0, La/pd3;->r1:I

    .line 59
    .line 60
    :cond_2
    iget p1, p0, La/pd3;->r1:I

    .line 61
    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    iget-object p1, p0, La/pd3;->j:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object p3, La/pd3;->G1:La/nuj0;

    .line 75
    .line 76
    invoke-virtual {p3, p1}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Ljava/lang/Integer;

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    iput p1, p0, La/pd3;->r1:I

    .line 89
    .line 90
    iget-object p1, p0, La/pd3;->j:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p3, p1}, La/nuj0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_3
    if-eqz p2, :cond_4

    .line 104
    .line 105
    invoke-virtual {p0, p2}, La/pd3;->F(Landroid/view/Window;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    invoke-static {}, La/td3;->d()V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public static G(Landroid/content/Context;)La/ss00;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, La/hd3;->c:La/ss00;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_1
    iget-object v1, v0, La/ss00;->a:La/ts00;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, La/ss00;->a(Ljava/lang/String;)La/ss00;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v0}, La/ss00;->b()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    sget-object v0, La/ss00;->b:La/ss00;

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_2
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    :goto_1
    iget-object v3, v1, La/ts00;->a:Landroid/os/LocaleList;

    .line 56
    .line 57
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    iget-object v4, p0, La/ss00;->a:La/ts00;

    .line 62
    .line 63
    iget-object v4, v4, La/ts00;->a:Landroid/os/LocaleList;

    .line 64
    .line 65
    invoke-virtual {v4}, Landroid/os/LocaleList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    add-int/2addr v4, v3

    .line 70
    if-ge v2, v4, :cond_5

    .line 71
    .line 72
    iget-object v3, v1, La/ts00;->a:Landroid/os/LocaleList;

    .line 73
    .line 74
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-ge v2, v3, :cond_3

    .line 79
    .line 80
    iget-object v3, v1, La/ts00;->a:Landroid/os/LocaleList;

    .line 81
    .line 82
    invoke-virtual {v3, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    iget-object v3, v1, La/ts00;->a:Landroid/os/LocaleList;

    .line 88
    .line 89
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    sub-int v3, v2, v3

    .line 94
    .line 95
    iget-object v4, p0, La/ss00;->a:La/ts00;

    .line 96
    .line 97
    iget-object v4, v4, La/ts00;->a:Landroid/os/LocaleList;

    .line 98
    .line 99
    invoke-virtual {v4, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :goto_2
    if-eqz v3, :cond_4

    .line 104
    .line 105
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    new-array v1, v1, [Ljava/util/Locale;

    .line 116
    .line 117
    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, [Ljava/util/Locale;

    .line 122
    .line 123
    new-instance v1, Landroid/os/LocaleList;

    .line 124
    .line 125
    invoke-direct {v1, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v1}, La/ss00;->c(Landroid/os/LocaleList;)La/ss00;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :goto_3
    invoke-virtual {v0}, La/ss00;->b()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_6

    .line 137
    .line 138
    return-object p0

    .line 139
    :cond_6
    return-object v0
.end method

.method public static K(Landroid/content/Context;ILa/ss00;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 24
    .line 25
    and-int/lit8 p0, p0, 0x30

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 p0, 0x20

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/16 p0, 0x10

    .line 32
    .line 33
    :goto_0
    new-instance p1, Landroid/content/res/Configuration;

    .line 34
    .line 35
    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 p4, 0x0

    .line 39
    iput p4, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 40
    .line 41
    if-eqz p3, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget p3, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 47
    .line 48
    and-int/lit8 p3, p3, -0x31

    .line 49
    .line 50
    or-int/2addr p0, p3

    .line 51
    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 52
    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    iget-object p0, p2, La/ss00;->a:La/ts00;

    .line 56
    .line 57
    iget-object p0, p0, La/ts00;->a:Landroid/os/LocaleList;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p1, p0}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 68
    .line 69
    .line 70
    :cond_4
    return-object p1
.end method


# virtual methods
.method public final A(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/pd3;->N()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/pd3;->z:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, La/pd3;->m:La/kd3;

    .line 22
    .line 23
    iget-object p0, p0, La/pd3;->l:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, p0}, La/kd3;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final B(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/pd3;->N()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/pd3;->z:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, La/pd3;->m:La/kd3;

    .line 22
    .line 23
    iget-object p0, p0, La/pd3;->l:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, p0}, La/kd3;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final C(I)V
    .locals 0

    .line 1
    iput p1, p0, La/pd3;->s1:I

    .line 2
    .line 3
    return-void
.end method

.method public final D(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iput-object p1, p0, La/pd3;->p:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget-object v0, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, La/pd3;->n:La/qhv0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p0, v0, La/qhv0;->e:La/blj;

    .line 16
    .line 17
    check-cast p0, La/rwq0;

    .line 18
    .line 19
    iget-boolean v0, p0, La/rwq0;->g:Z

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 24
    .line 25
    iput-object p1, p0, La/rwq0;->h:Ljava/lang/CharSequence;

    .line 26
    .line 27
    iget v1, p0, La/rwq0;->b:I

    .line 28
    .line 29
    and-int/lit8 v1, v1, 0x8

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-boolean p0, p0, La/rwq0;->g:Z

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0, p1}, La/rgu0;->p(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    iget-object p0, p0, La/pd3;->A:Landroid/widget/TextView;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public final E(ZZ)Z
    .locals 13

    .line 1
    iget-boolean v0, p0, La/pd3;->p1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/16 v0, -0x64

    .line 8
    .line 9
    iget v2, p0, La/pd3;->r1:I

    .line 10
    .line 11
    if-eq v2, v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    sget v2, La/hd3;->b:I

    .line 15
    .line 16
    :goto_0
    iget-object v0, p0, La/pd3;->k:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {p0, v2, v0}, La/pd3;->T(ILandroid/content/Context;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v5, 0x21

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    if-ge v4, v5, :cond_2

    .line 28
    .line 29
    invoke-static {v0}, La/pd3;->G(Landroid/content/Context;)La/ss00;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object v5, v6

    .line 35
    :goto_1
    if-nez p2, :cond_3

    .line 36
    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p2}, La/ss00;->a(Ljava/lang/String;)La/ss00;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    :cond_3
    invoke-static {v0, v3, v5, v6, v1}, La/pd3;->K(Landroid/content/Context;ILa/ss00;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iget-boolean v3, p0, La/pd3;->u1:Z

    .line 64
    .line 65
    const/4 v7, 0x1

    .line 66
    iget-object v8, p0, La/pd3;->j:Ljava/lang/Object;

    .line 67
    .line 68
    if-nez v3, :cond_6

    .line 69
    .line 70
    instance-of v3, v8, Landroid/app/Activity;

    .line 71
    .line 72
    if-eqz v3, :cond_6

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    move v3, v1

    .line 81
    goto :goto_4

    .line 82
    :cond_4
    const/16 v9, 0x1d

    .line 83
    .line 84
    if-lt v4, v9, :cond_5

    .line 85
    .line 86
    const/high16 v4, 0x100c0000

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    const/high16 v4, 0xc0000

    .line 90
    .line 91
    :goto_2
    :try_start_0
    new-instance v9, Landroid/content/ComponentName;

    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    invoke-direct {v9, v0, v10}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v9, v4}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-eqz v3, :cond_6

    .line 105
    .line 106
    iget v3, v3, Landroid/content/pm/ActivityInfo;->configChanges:I

    .line 107
    .line 108
    iput v3, p0, La/pd3;->t1:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :catch_0
    move-exception v3

    .line 112
    const-string v4, "AppCompatDelegate"

    .line 113
    .line 114
    const-string v9, "Exception while getting ActivityInfo"

    .line 115
    .line 116
    invoke-static {v4, v9, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 117
    .line 118
    .line 119
    iput v1, p0, La/pd3;->t1:I

    .line 120
    .line 121
    :cond_6
    :goto_3
    iput-boolean v7, p0, La/pd3;->u1:Z

    .line 122
    .line 123
    iget v3, p0, La/pd3;->t1:I

    .line 124
    .line 125
    :goto_4
    iget-object v4, p0, La/pd3;->q1:Landroid/content/res/Configuration;

    .line 126
    .line 127
    if-nez v4, :cond_7

    .line 128
    .line 129
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :cond_7
    iget v9, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 138
    .line 139
    and-int/lit8 v9, v9, 0x30

    .line 140
    .line 141
    iget v10, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 142
    .line 143
    and-int/lit8 v10, v10, 0x30

    .line 144
    .line 145
    invoke-virtual {v4}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-static {v4}, La/ss00;->a(Ljava/lang/String;)La/ss00;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    if-nez v5, :cond_8

    .line 158
    .line 159
    move-object v5, v6

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-virtual {v5}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-static {v5}, La/ss00;->a(Ljava/lang/String;)La/ss00;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    :goto_5
    if-eq v9, v10, :cond_9

    .line 174
    .line 175
    const/16 v9, 0x200

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_9
    move v9, v1

    .line 179
    :goto_6
    if-eqz v5, :cond_a

    .line 180
    .line 181
    invoke-virtual {v4, v5}, La/ss00;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-nez v4, :cond_a

    .line 186
    .line 187
    or-int/lit16 v9, v9, 0x2004

    .line 188
    .line 189
    :cond_a
    not-int v4, v3

    .line 190
    and-int/2addr v4, v9

    .line 191
    const/16 v11, 0x1c

    .line 192
    .line 193
    if-eqz v4, :cond_e

    .line 194
    .line 195
    if-eqz p1, :cond_e

    .line 196
    .line 197
    iget-boolean p1, p0, La/pd3;->n1:Z

    .line 198
    .line 199
    if-eqz p1, :cond_e

    .line 200
    .line 201
    sget-boolean p1, La/pd3;->I1:Z

    .line 202
    .line 203
    if-nez p1, :cond_b

    .line 204
    .line 205
    iget-boolean p1, p0, La/pd3;->o1:Z

    .line 206
    .line 207
    if-eqz p1, :cond_e

    .line 208
    .line 209
    :cond_b
    instance-of p1, v8, Landroid/app/Activity;

    .line 210
    .line 211
    if-eqz p1, :cond_e

    .line 212
    .line 213
    move-object p1, v8

    .line 214
    check-cast p1, Landroid/app/Activity;

    .line 215
    .line 216
    invoke-virtual {p1}, Landroid/app/Activity;->isChild()Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-nez v4, :cond_e

    .line 221
    .line 222
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 223
    .line 224
    const/16 v12, 0x1f

    .line 225
    .line 226
    if-lt v4, v12, :cond_c

    .line 227
    .line 228
    and-int/lit16 v12, v9, 0x2000

    .line 229
    .line 230
    if-eqz v12, :cond_c

    .line 231
    .line 232
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    invoke-virtual {v12}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 237
    .line 238
    .line 239
    move-result-object v12

    .line 240
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    invoke-virtual {v12, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 245
    .line 246
    .line 247
    :cond_c
    if-lt v4, v11, :cond_d

    .line 248
    .line 249
    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    .line 250
    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_d
    new-instance p2, Landroid/os/Handler;

    .line 254
    .line 255
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-direct {p2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 260
    .line 261
    .line 262
    new-instance v4, La/w1;

    .line 263
    .line 264
    invoke-direct {v4, p1, v7}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 268
    .line 269
    .line 270
    :goto_7
    move p1, v7

    .line 271
    goto :goto_8

    .line 272
    :cond_e
    move p1, v1

    .line 273
    :goto_8
    if-nez p1, :cond_1e

    .line 274
    .line 275
    if-eqz v9, :cond_1e

    .line 276
    .line 277
    and-int p1, v9, v3

    .line 278
    .line 279
    if-ne p1, v9, :cond_f

    .line 280
    .line 281
    move v1, v7

    .line 282
    :cond_f
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    new-instance p2, Landroid/content/res/Configuration;

    .line 287
    .line 288
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-direct {p2, v3}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    iget v3, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 300
    .line 301
    and-int/lit8 v3, v3, -0x31

    .line 302
    .line 303
    or-int/2addr v3, v10

    .line 304
    iput v3, p2, Landroid/content/res/Configuration;->uiMode:I

    .line 305
    .line 306
    if-eqz v5, :cond_10

    .line 307
    .line 308
    iget-object v3, v5, La/ss00;->a:La/ts00;

    .line 309
    .line 310
    iget-object v3, v3, La/ts00;->a:Landroid/os/LocaleList;

    .line 311
    .line 312
    invoke-virtual {v3}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-static {v3}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {p2, v3}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 321
    .line 322
    .line 323
    :cond_10
    invoke-virtual {p1, p2, v6}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 324
    .line 325
    .line 326
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 327
    .line 328
    const/16 v4, 0x1a

    .line 329
    .line 330
    if-ge v3, v4, :cond_1b

    .line 331
    .line 332
    if-lt v3, v11, :cond_11

    .line 333
    .line 334
    goto/16 :goto_10

    .line 335
    .line 336
    :cond_11
    sget-boolean v3, La/zvw;->h:Z

    .line 337
    .line 338
    const-string v4, "ResourcesFlusher"

    .line 339
    .line 340
    if-nez v3, :cond_12

    .line 341
    .line 342
    :try_start_1
    const-class v3, Landroid/content/res/Resources;

    .line 343
    .line 344
    const-string v9, "mResourcesImpl"

    .line 345
    .line 346
    invoke-virtual {v3, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    sput-object v3, La/zvw;->g:Ljava/lang/reflect/Field;

    .line 351
    .line 352
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 353
    .line 354
    .line 355
    goto :goto_9

    .line 356
    :catch_1
    move-exception v3

    .line 357
    const-string v9, "Could not retrieve Resources#mResourcesImpl field"

    .line 358
    .line 359
    invoke-static {v4, v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 360
    .line 361
    .line 362
    :goto_9
    sput-boolean v7, La/zvw;->h:Z

    .line 363
    .line 364
    :cond_12
    sget-object v3, La/zvw;->g:Ljava/lang/reflect/Field;

    .line 365
    .line 366
    if-nez v3, :cond_13

    .line 367
    .line 368
    goto/16 :goto_10

    .line 369
    .line 370
    :cond_13
    :try_start_2
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    .line 374
    goto :goto_a

    .line 375
    :catch_2
    move-exception p1

    .line 376
    const-string v3, "Could not retrieve value from Resources#mResourcesImpl"

    .line 377
    .line 378
    invoke-static {v4, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 379
    .line 380
    .line 381
    move-object p1, v6

    .line 382
    :goto_a
    if-nez p1, :cond_14

    .line 383
    .line 384
    goto/16 :goto_10

    .line 385
    .line 386
    :cond_14
    sget-boolean v3, La/zvw;->b:Z

    .line 387
    .line 388
    if-nez v3, :cond_15

    .line 389
    .line 390
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    const-string v9, "mDrawableCache"

    .line 395
    .line 396
    invoke-virtual {v3, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    sput-object v3, La/zvw;->a:Ljava/lang/reflect/Field;

    .line 401
    .line 402
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_3

    .line 403
    .line 404
    .line 405
    goto :goto_b

    .line 406
    :catch_3
    move-exception v3

    .line 407
    const-string v9, "Could not retrieve ResourcesImpl#mDrawableCache field"

    .line 408
    .line 409
    invoke-static {v4, v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 410
    .line 411
    .line 412
    :goto_b
    sput-boolean v7, La/zvw;->b:Z

    .line 413
    .line 414
    :cond_15
    sget-object v3, La/zvw;->a:Ljava/lang/reflect/Field;

    .line 415
    .line 416
    if-eqz v3, :cond_16

    .line 417
    .line 418
    :try_start_4
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_4

    .line 422
    goto :goto_c

    .line 423
    :catch_4
    move-exception p1

    .line 424
    const-string v3, "Could not retrieve value from ResourcesImpl#mDrawableCache"

    .line 425
    .line 426
    invoke-static {v4, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 427
    .line 428
    .line 429
    :cond_16
    move-object p1, v6

    .line 430
    :goto_c
    if-eqz p1, :cond_1b

    .line 431
    .line 432
    sget-boolean v3, La/zvw;->d:Z

    .line 433
    .line 434
    if-nez v3, :cond_17

    .line 435
    .line 436
    :try_start_5
    const-string v3, "android.content.res.ThemedResourceCache"

    .line 437
    .line 438
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    sput-object v3, La/zvw;->c:Ljava/lang/Class;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 443
    .line 444
    goto :goto_d

    .line 445
    :catch_5
    move-exception v3

    .line 446
    const-string v9, "Could not find ThemedResourceCache class"

    .line 447
    .line 448
    invoke-static {v4, v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 449
    .line 450
    .line 451
    :goto_d
    sput-boolean v7, La/zvw;->d:Z

    .line 452
    .line 453
    :cond_17
    sget-object v3, La/zvw;->c:Ljava/lang/Class;

    .line 454
    .line 455
    if-nez v3, :cond_18

    .line 456
    .line 457
    goto :goto_10

    .line 458
    :cond_18
    sget-boolean v9, La/zvw;->f:Z

    .line 459
    .line 460
    if-nez v9, :cond_19

    .line 461
    .line 462
    :try_start_6
    const-string v9, "mUnthemedEntries"

    .line 463
    .line 464
    invoke-virtual {v3, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    sput-object v3, La/zvw;->e:Ljava/lang/reflect/Field;

    .line 469
    .line 470
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_6

    .line 471
    .line 472
    .line 473
    goto :goto_e

    .line 474
    :catch_6
    move-exception v3

    .line 475
    const-string v9, "Could not retrieve ThemedResourceCache#mUnthemedEntries field"

    .line 476
    .line 477
    invoke-static {v4, v9, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 478
    .line 479
    .line 480
    :goto_e
    sput-boolean v7, La/zvw;->f:Z

    .line 481
    .line 482
    :cond_19
    sget-object v3, La/zvw;->e:Ljava/lang/reflect/Field;

    .line 483
    .line 484
    if-nez v3, :cond_1a

    .line 485
    .line 486
    goto :goto_10

    .line 487
    :cond_1a
    :try_start_7
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    check-cast p1, Landroid/util/LongSparseArray;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_7

    .line 492
    .line 493
    move-object v6, p1

    .line 494
    goto :goto_f

    .line 495
    :catch_7
    move-exception p1

    .line 496
    const-string v3, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"

    .line 497
    .line 498
    invoke-static {v4, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 499
    .line 500
    .line 501
    :goto_f
    if-eqz v6, :cond_1b

    .line 502
    .line 503
    invoke-virtual {v6}, Landroid/util/LongSparseArray;->clear()V

    .line 504
    .line 505
    .line 506
    :cond_1b
    :goto_10
    iget p1, p0, La/pd3;->s1:I

    .line 507
    .line 508
    if-eqz p1, :cond_1c

    .line 509
    .line 510
    invoke-virtual {v0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    iget v3, p0, La/pd3;->s1:I

    .line 518
    .line 519
    invoke-virtual {p1, v3, v7}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 520
    .line 521
    .line 522
    :cond_1c
    if-eqz v1, :cond_1f

    .line 523
    .line 524
    instance-of p1, v8, Landroid/app/Activity;

    .line 525
    .line 526
    if-eqz p1, :cond_1f

    .line 527
    .line 528
    check-cast v8, Landroid/app/Activity;

    .line 529
    .line 530
    instance-of p1, v8, La/clz;

    .line 531
    .line 532
    if-eqz p1, :cond_1d

    .line 533
    .line 534
    move-object p1, v8

    .line 535
    check-cast p1, La/clz;

    .line 536
    .line 537
    invoke-interface {p1}, La/clz;->x()La/glz;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    iget-object p1, p1, La/glz;->i:La/lkz;

    .line 542
    .line 543
    sget-object v1, La/lkz;->c:La/lkz;

    .line 544
    .line 545
    invoke-virtual {p1, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 546
    .line 547
    .line 548
    move-result p1

    .line 549
    if-ltz p1, :cond_1f

    .line 550
    .line 551
    invoke-virtual {v8, p2}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 552
    .line 553
    .line 554
    iget-object p1, p0, La/pd3;->l:Landroid/view/Window;

    .line 555
    .line 556
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    invoke-virtual {p1, p2}, Landroid/view/View;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 561
    .line 562
    .line 563
    goto :goto_11

    .line 564
    :cond_1d
    iget-boolean p1, p0, La/pd3;->o1:Z

    .line 565
    .line 566
    if-eqz p1, :cond_1f

    .line 567
    .line 568
    iget-boolean p1, p0, La/pd3;->p1:Z

    .line 569
    .line 570
    if-nez p1, :cond_1f

    .line 571
    .line 572
    invoke-virtual {v8, p2}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 573
    .line 574
    .line 575
    iget-object p1, p0, La/pd3;->l:Landroid/view/Window;

    .line 576
    .line 577
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    invoke-virtual {p1, p2}, Landroid/view/View;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 582
    .line 583
    .line 584
    goto :goto_11

    .line 585
    :cond_1e
    move v7, p1

    .line 586
    :cond_1f
    :goto_11
    if-eqz v5, :cond_20

    .line 587
    .line 588
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    invoke-virtual {p1}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object p1

    .line 604
    invoke-static {p1}, La/ss00;->a(Ljava/lang/String;)La/ss00;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    iget-object p1, p1, La/ss00;->a:La/ts00;

    .line 609
    .line 610
    iget-object p1, p1, La/ts00;->a:Landroid/os/LocaleList;

    .line 611
    .line 612
    invoke-virtual {p1}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object p1

    .line 616
    invoke-static {p1}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    invoke-static {p1}, Landroid/os/LocaleList;->setDefault(Landroid/os/LocaleList;)V

    .line 621
    .line 622
    .line 623
    :cond_20
    if-nez v2, :cond_21

    .line 624
    .line 625
    invoke-virtual {p0, v0}, La/pd3;->P(Landroid/content/Context;)La/c2;

    .line 626
    .line 627
    .line 628
    move-result-object p1

    .line 629
    invoke-virtual {p1}, La/c2;->I()V

    .line 630
    .line 631
    .line 632
    goto :goto_12

    .line 633
    :cond_21
    iget-object p1, p0, La/pd3;->v1:La/ld3;

    .line 634
    .line 635
    if-eqz p1, :cond_22

    .line 636
    .line 637
    invoke-virtual {p1}, La/c2;->e()V

    .line 638
    .line 639
    .line 640
    :cond_22
    :goto_12
    iget-object p1, p0, La/pd3;->w1:La/ld3;

    .line 641
    .line 642
    const/4 p2, 0x3

    .line 643
    if-ne v2, p2, :cond_24

    .line 644
    .line 645
    if-nez p1, :cond_23

    .line 646
    .line 647
    new-instance p1, La/ld3;

    .line 648
    .line 649
    invoke-direct {p1, p0, v0}, La/ld3;-><init>(La/pd3;Landroid/content/Context;)V

    .line 650
    .line 651
    .line 652
    iput-object p1, p0, La/pd3;->w1:La/ld3;

    .line 653
    .line 654
    :cond_23
    invoke-virtual {p1}, La/c2;->I()V

    .line 655
    .line 656
    .line 657
    goto :goto_13

    .line 658
    :cond_24
    if-eqz p1, :cond_25

    .line 659
    .line 660
    invoke-virtual {p1}, La/c2;->e()V

    .line 661
    .line 662
    .line 663
    :cond_25
    :goto_13
    return v7
.end method

.method public final F(Landroid/view/Window;)V
    .locals 7

    .line 1
    const-string v0, "AppCompat has already installed itself into the Window"

    .line 2
    .line 3
    iget-object v1, p0, La/pd3;->l:Landroid/view/Window;

    .line 4
    .line 5
    if-nez v1, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, La/kd3;

    .line 12
    .line 13
    if-nez v2, :cond_5

    .line 14
    .line 15
    new-instance v0, La/kd3;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, La/kd3;-><init>(La/pd3;Landroid/view/Window$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/pd3;->m:La/kd3;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, La/pd3;->k:Landroid/content/Context;

    .line 26
    .line 27
    sget-object v1, La/pd3;->H1:[I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-static {}, La/td3;->a()La/td3;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    monitor-enter v4

    .line 52
    :try_start_0
    iget-object v5, v4, La/td3;->a:La/dtf0;

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-virtual {v5, v0, v3, v6}, La/dtf0;->e(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit v4

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p0

    .line 64
    :cond_0
    move-object v0, v2

    .line 65
    :goto_0
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, La/pd3;->l:Landroid/view/Window;

    .line 74
    .line 75
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v0, 0x21

    .line 78
    .line 79
    if-lt p1, v0, :cond_4

    .line 80
    .line 81
    iget-object p1, p0, La/pd3;->E1:Landroid/window/OnBackInvokedDispatcher;

    .line 82
    .line 83
    if-nez p1, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, La/pd3;->j:Ljava/lang/Object;

    .line 86
    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    iget-object v1, p0, La/pd3;->F1:La/ma3;

    .line 90
    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    invoke-static {v1}, La/c7;->e(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {p1}, La/c7;->g(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1, v1}, La/c7;->p(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 102
    .line 103
    .line 104
    iput-object v2, p0, La/pd3;->F1:La/ma3;

    .line 105
    .line 106
    :cond_2
    instance-of p1, v0, Landroid/app/Activity;

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    check-cast v0, Landroid/app/Activity;

    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-eqz p1, :cond_3

    .line 117
    .line 118
    invoke-static {v0}, La/c7;->f(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, La/pd3;->E1:Landroid/window/OnBackInvokedDispatcher;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    iput-object v2, p0, La/pd3;->E1:Landroid/window/OnBackInvokedDispatcher;

    .line 126
    .line 127
    :goto_1
    invoke-virtual {p0}, La/pd3;->Z()V

    .line 128
    .line 129
    .line 130
    :cond_4
    return-void

    .line 131
    :cond_5
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final H(ILa/od3;La/ox30;)V
    .locals 2

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La/pd3;->k1:[La/od3;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-ge p1, v1, :cond_0

    .line 11
    .line 12
    aget-object p2, v0, p1

    .line 13
    .line 14
    :cond_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p3, p2, La/od3;->h:La/ox30;

    .line 17
    .line 18
    :cond_1
    if-eqz p2, :cond_2

    .line 19
    .line 20
    iget-boolean p2, p2, La/od3;->m:Z

    .line 21
    .line 22
    if-nez p2, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean p2, p0, La/pd3;->p1:Z

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    iget-object p2, p0, La/pd3;->m:La/kd3;

    .line 30
    .line 31
    iget-object p0, p0, La/pd3;->l:Landroid/view/Window;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    const/4 v1, 0x0

    .line 42
    :try_start_0
    iput-boolean v0, p2, La/kd3;->d:Z

    .line 43
    .line 44
    invoke-interface {p0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    iput-boolean v1, p2, La/kd3;->d:Z

    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    iput-boolean v1, p2, La/kd3;->d:Z

    .line 52
    .line 53
    throw p0

    .line 54
    :cond_3
    :goto_0
    return-void
.end method

.method public final I(La/ox30;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/pd3;->j1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, La/pd3;->j1:Z

    .line 8
    .line 9
    iget-object v0, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 15
    .line 16
    check-cast v0, La/rwq0;

    .line 17
    .line 18
    iget-object v0, v0, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, La/xi;->j()Z

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, La/xi;->t:La/ui;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, La/yz30;->b()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v0, v0, La/yz30;->j:La/wz30;

    .line 42
    .line 43
    invoke-interface {v0}, La/tsj0;->dismiss()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, La/pd3;->l:Landroid/view/Window;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-boolean v1, p0, La/pd3;->p1:Z

    .line 55
    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    const/16 v1, 0x6c

    .line 59
    .line 60
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    const/4 p1, 0x0

    .line 64
    iput-boolean p1, p0, La/pd3;->j1:Z

    .line 65
    .line 66
    return-void
.end method

.method public final J(La/od3;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p1, La/od3;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 15
    .line 16
    check-cast v0, La/rwq0;

    .line 17
    .line 18
    iget-object v0, v0, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, La/xi;->k()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object p1, p1, La/od3;->h:La/ox30;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, La/pd3;->I(La/ox30;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iget-object v0, p0, La/pd3;->k:Landroid/content/Context;

    .line 41
    .line 42
    const-string v1, "window"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroid/view/WindowManager;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget-boolean v2, p1, La/od3;->m:Z

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    iget-object v2, p1, La/od3;->e:La/nd3;

    .line 58
    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    iget p2, p1, La/od3;->a:I

    .line 67
    .line 68
    invoke-virtual {p0, p2, p1, v1}, La/pd3;->H(ILa/od3;La/ox30;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 p2, 0x0

    .line 72
    iput-boolean p2, p1, La/od3;->k:Z

    .line 73
    .line 74
    iput-boolean p2, p1, La/od3;->l:Z

    .line 75
    .line 76
    iput-boolean p2, p1, La/od3;->m:Z

    .line 77
    .line 78
    iput-object v1, p1, La/od3;->f:Landroid/view/View;

    .line 79
    .line 80
    const/4 p2, 0x1

    .line 81
    iput-boolean p2, p1, La/od3;->n:Z

    .line 82
    .line 83
    iget-object p2, p0, La/pd3;->l1:La/od3;

    .line 84
    .line 85
    if-ne p2, p1, :cond_2

    .line 86
    .line 87
    iput-object v1, p0, La/pd3;->l1:La/od3;

    .line 88
    .line 89
    :cond_2
    iget p1, p1, La/od3;->a:I

    .line 90
    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, La/pd3;->Z()V

    .line 94
    .line 95
    .line 96
    :cond_3
    return-void
.end method

.method public final L(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, La/pd3;->j:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, La/hky;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    instance-of v0, v0, La/rd3;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, La/pd3;->l:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {v0, p1}, La/rgu0;->d(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_6

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    const/16 v3, 0x52

    .line 34
    .line 35
    if-ne v0, v3, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, La/pd3;->m:La/kd3;

    .line 38
    .line 39
    iget-object v4, p0, La/pd3;->l:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    :try_start_0
    iput-boolean v2, v0, La/kd3;->c:Z

    .line 49
    .line 50
    invoke-interface {v4, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 51
    .line 52
    .line 53
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    iput-boolean v1, v0, La/kd3;->c:Z

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :catchall_0
    move-exception p0

    .line 61
    iput-boolean v1, v0, La/kd3;->c:Z

    .line 62
    .line 63
    throw p0

    .line 64
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x4

    .line 73
    if-nez v4, :cond_6

    .line 74
    .line 75
    if-eq v0, v5, :cond_4

    .line 76
    .line 77
    if-eq v0, v3, :cond_3

    .line 78
    .line 79
    goto/16 :goto_7

    .line 80
    .line 81
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_11

    .line 86
    .line 87
    invoke-virtual {p0, v1}, La/pd3;->Q(I)La/od3;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-boolean v1, v0, La/od3;->m:Z

    .line 92
    .line 93
    if-nez v1, :cond_11

    .line 94
    .line 95
    invoke-virtual {p0, v0, p1}, La/pd3;->X(La/od3;Landroid/view/KeyEvent;)Z

    .line 96
    .line 97
    .line 98
    return v2

    .line 99
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    and-int/lit16 p1, p1, 0x80

    .line 104
    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    move v2, v1

    .line 109
    :goto_0
    iput-boolean v2, p0, La/pd3;->m1:Z

    .line 110
    .line 111
    return v1

    .line 112
    :cond_6
    if-eq v0, v5, :cond_10

    .line 113
    .line 114
    if-eq v0, v3, :cond_7

    .line 115
    .line 116
    goto/16 :goto_7

    .line 117
    .line 118
    :cond_7
    iget-object v0, p0, La/pd3;->t:La/xj;

    .line 119
    .line 120
    if-eqz v0, :cond_8

    .line 121
    .line 122
    goto/16 :goto_6

    .line 123
    .line 124
    :cond_8
    invoke-virtual {p0, v1}, La/pd3;->Q(I)La/od3;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iget-object v3, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 129
    .line 130
    iget-object v4, p0, La/pd3;->k:Landroid/content/Context;

    .line 131
    .line 132
    if-eqz v3, :cond_a

    .line 133
    .line 134
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 135
    .line 136
    .line 137
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 138
    .line 139
    check-cast v3, La/rwq0;

    .line 140
    .line 141
    iget-object v3, v3, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 142
    .line 143
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-nez v5, :cond_a

    .line 148
    .line 149
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 150
    .line 151
    if-eqz v3, :cond_a

    .line 152
    .line 153
    iget-boolean v3, v3, Landroidx/appcompat/widget/ActionMenuView;->s:Z

    .line 154
    .line 155
    if-eqz v3, :cond_a

    .line 156
    .line 157
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_a

    .line 166
    .line 167
    iget-object v3, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 168
    .line 169
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 170
    .line 171
    .line 172
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 173
    .line 174
    check-cast v3, La/rwq0;

    .line 175
    .line 176
    iget-object v3, v3, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 177
    .line 178
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 179
    .line 180
    if-eqz v3, :cond_9

    .line 181
    .line 182
    iget-object v3, v3, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 183
    .line 184
    if-eqz v3, :cond_9

    .line 185
    .line 186
    invoke-virtual {v3}, La/xi;->k()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_9

    .line 191
    .line 192
    iget-object p0, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 193
    .line 194
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 198
    .line 199
    check-cast p0, La/rwq0;

    .line 200
    .line 201
    iget-object p0, p0, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 202
    .line 203
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 204
    .line 205
    if-eqz p0, :cond_d

    .line 206
    .line 207
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 208
    .line 209
    if-eqz p0, :cond_d

    .line 210
    .line 211
    invoke-virtual {p0}, La/xi;->j()Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-eqz p0, :cond_d

    .line 216
    .line 217
    :goto_1
    goto :goto_3

    .line 218
    :cond_9
    iget-boolean v3, p0, La/pd3;->p1:Z

    .line 219
    .line 220
    if-nez v3, :cond_d

    .line 221
    .line 222
    invoke-virtual {p0, v0, p1}, La/pd3;->X(La/od3;Landroid/view/KeyEvent;)Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_d

    .line 227
    .line 228
    iget-object p0, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 229
    .line 230
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 231
    .line 232
    .line 233
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 234
    .line 235
    check-cast p0, La/rwq0;

    .line 236
    .line 237
    iget-object p0, p0, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 238
    .line 239
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 240
    .line 241
    if-eqz p0, :cond_d

    .line 242
    .line 243
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 244
    .line 245
    if-eqz p0, :cond_d

    .line 246
    .line 247
    invoke-virtual {p0}, La/xi;->l()Z

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    if-eqz p0, :cond_d

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_a
    iget-boolean v3, v0, La/od3;->m:Z

    .line 255
    .line 256
    if-nez v3, :cond_e

    .line 257
    .line 258
    iget-boolean v5, v0, La/od3;->l:Z

    .line 259
    .line 260
    if-eqz v5, :cond_b

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_b
    iget-boolean v3, v0, La/od3;->k:Z

    .line 264
    .line 265
    if-eqz v3, :cond_d

    .line 266
    .line 267
    iget-boolean v3, v0, La/od3;->o:Z

    .line 268
    .line 269
    if-eqz v3, :cond_c

    .line 270
    .line 271
    iput-boolean v1, v0, La/od3;->k:Z

    .line 272
    .line 273
    invoke-virtual {p0, v0, p1}, La/pd3;->X(La/od3;Landroid/view/KeyEvent;)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    goto :goto_2

    .line 278
    :cond_c
    move v3, v2

    .line 279
    :goto_2
    if-eqz v3, :cond_d

    .line 280
    .line 281
    invoke-virtual {p0, v0, p1}, La/pd3;->V(La/od3;Landroid/view/KeyEvent;)V

    .line 282
    .line 283
    .line 284
    :goto_3
    move p0, v2

    .line 285
    goto :goto_5

    .line 286
    :cond_d
    move p0, v1

    .line 287
    goto :goto_5

    .line 288
    :cond_e
    :goto_4
    invoke-virtual {p0, v0, v2}, La/pd3;->J(La/od3;Z)V

    .line 289
    .line 290
    .line 291
    move p0, v3

    .line 292
    :goto_5
    if-eqz p0, :cond_11

    .line 293
    .line 294
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    const-string p1, "audio"

    .line 299
    .line 300
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    check-cast p0, Landroid/media/AudioManager;

    .line 305
    .line 306
    if-eqz p0, :cond_f

    .line 307
    .line 308
    invoke-virtual {p0, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 309
    .line 310
    .line 311
    return v2

    .line 312
    :cond_f
    const-string p0, "AppCompatDelegate"

    .line 313
    .line 314
    const-string p1, "Couldn\'t get audio manager"

    .line 315
    .line 316
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 317
    .line 318
    .line 319
    return v2

    .line 320
    :cond_10
    invoke-virtual {p0}, La/pd3;->U()Z

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-eqz p0, :cond_12

    .line 325
    .line 326
    :cond_11
    :goto_6
    return v2

    .line 327
    :cond_12
    :goto_7
    return v1
.end method

.method public final M(I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, La/pd3;->Q(I)La/od3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/od3;->h:La/ox30;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    new-instance v1, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, La/od3;->h:La/ox30;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, La/ox30;->t(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    iput-object v1, v0, La/od3;->p:Landroid/os/Bundle;

    .line 26
    .line 27
    :cond_0
    iget-object v1, v0, La/od3;->h:La/ox30;

    .line 28
    .line 29
    invoke-virtual {v1}, La/ox30;->w()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, La/od3;->h:La/ox30;

    .line 33
    .line 34
    invoke-virtual {v1}, La/ox30;->clear()V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v1, 0x1

    .line 38
    iput-boolean v1, v0, La/od3;->o:Z

    .line 39
    .line 40
    iput-boolean v1, v0, La/od3;->n:Z

    .line 41
    .line 42
    const/16 v0, 0x6c

    .line 43
    .line 44
    if-eq p1, v0, :cond_2

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1}, La/pd3;->Q(I)La/od3;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-boolean p1, v0, La/od3;->k:Z

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, v0, p1}, La/pd3;->X(La/od3;Landroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final N()V
    .locals 12

    .line 1
    iget-boolean v0, p0, La/pd3;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_1b

    .line 4
    .line 5
    iget-object v0, p0, La/pd3;->k:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v1, La/mqd0;->j:[I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v3, 0x75

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_1a

    .line 20
    .line 21
    const/16 v4, 0x7e

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v6, 0x6c

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v7}, La/pd3;->y(I)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v6}, La/pd3;->y(I)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    const/16 v3, 0x76

    .line 47
    .line 48
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v4, 0x6d

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v4}, La/pd3;->y(I)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    const/16 v3, 0x77

    .line 60
    .line 61
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    const/16 v3, 0xa

    .line 68
    .line 69
    invoke-virtual {p0, v3}, La/pd3;->y(I)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v2, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iput-boolean v3, p0, La/pd3;->h1:Z

    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, La/pd3;->O()V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, La/pd3;->l:Landroid/view/Window;

    .line 85
    .line 86
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-boolean v3, p0, La/pd3;->i1:Z

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    if-nez v3, :cond_9

    .line 97
    .line 98
    iget-boolean v3, p0, La/pd3;->h1:Z

    .line 99
    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    const v3, 0x7f0d000c

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Landroid/view/ViewGroup;

    .line 110
    .line 111
    iput-boolean v5, p0, La/pd3;->f1:Z

    .line 112
    .line 113
    iput-boolean v5, p0, La/pd3;->Z:Z

    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_4
    iget-boolean v2, p0, La/pd3;->Z:Z

    .line 118
    .line 119
    if-eqz v2, :cond_8

    .line 120
    .line 121
    new-instance v2, Landroid/util/TypedValue;

    .line 122
    .line 123
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const v9, 0x7f040024

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v9, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 134
    .line 135
    .line 136
    iget v3, v2, Landroid/util/TypedValue;->resourceId:I

    .line 137
    .line 138
    if-eqz v3, :cond_5

    .line 139
    .line 140
    new-instance v3, La/tje;

    .line 141
    .line 142
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 143
    .line 144
    invoke-direct {v3, v0, v2}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    move-object v3, v0

    .line 149
    :goto_1
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const v3, 0x7f0d0017

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Landroid/view/ViewGroup;

    .line 161
    .line 162
    const v3, 0x7f0a0429

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 170
    .line 171
    iput-object v3, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 172
    .line 173
    iget-object v9, p0, La/pd3;->l:Landroid/view/Window;

    .line 174
    .line 175
    invoke-virtual {v9}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-virtual {v3, v9}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v3, p0, La/pd3;->f1:Z

    .line 183
    .line 184
    if-eqz v3, :cond_6

    .line 185
    .line 186
    iget-object v3, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 187
    .line 188
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f(I)V

    .line 189
    .line 190
    .line 191
    :cond_6
    iget-boolean v3, p0, La/pd3;->B:Z

    .line 192
    .line 193
    if-eqz v3, :cond_7

    .line 194
    .line 195
    iget-object v3, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 196
    .line 197
    const/4 v4, 0x2

    .line 198
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f(I)V

    .line 199
    .line 200
    .line 201
    :cond_7
    iget-boolean v3, p0, La/pd3;->Y:Z

    .line 202
    .line 203
    if-eqz v3, :cond_b

    .line 204
    .line 205
    iget-object v3, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 206
    .line 207
    const/4 v4, 0x5

    .line 208
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->f(I)V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_8
    move-object v2, v8

    .line 213
    goto :goto_2

    .line 214
    :cond_9
    iget-boolean v3, p0, La/pd3;->g1:Z

    .line 215
    .line 216
    if-eqz v3, :cond_a

    .line 217
    .line 218
    const v3, 0x7f0d0016

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    check-cast v2, Landroid/view/ViewGroup;

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_a
    const v3, 0x7f0d0015

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, Landroid/view/ViewGroup;

    .line 236
    .line 237
    :cond_b
    :goto_2
    if-eqz v2, :cond_19

    .line 238
    .line 239
    new-instance v3, La/peg0;

    .line 240
    .line 241
    const/16 v4, 0x8

    .line 242
    .line 243
    invoke-direct {v3, p0, v4}, La/peg0;-><init>(Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    sget-object v9, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 247
    .line 248
    invoke-static {v2, v3}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 249
    .line 250
    .line 251
    iget-object v3, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 252
    .line 253
    if-nez v3, :cond_c

    .line 254
    .line 255
    const v3, 0x7f0a0fce

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    check-cast v3, Landroid/widget/TextView;

    .line 263
    .line 264
    iput-object v3, p0, La/pd3;->A:Landroid/widget/TextView;

    .line 265
    .line 266
    :cond_c
    sget-boolean v3, La/cmu0;->a:Z

    .line 267
    .line 268
    const-string v3, "Could not invoke makeOptionalFitsSystemWindows"

    .line 269
    .line 270
    const-string v9, "ViewUtils"

    .line 271
    .line 272
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    const-string v11, "makeOptionalFitsSystemWindows"

    .line 277
    .line 278
    invoke-virtual {v10, v11, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-virtual {v10}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    if-nez v11, :cond_d

    .line 287
    .line 288
    invoke-virtual {v10, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 289
    .line 290
    .line 291
    goto :goto_3

    .line 292
    :catch_0
    move-exception v10

    .line 293
    goto :goto_4

    .line 294
    :catch_1
    move-exception v10

    .line 295
    goto :goto_5

    .line 296
    :cond_d
    :goto_3
    invoke-virtual {v10, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 297
    .line 298
    .line 299
    goto :goto_6

    .line 300
    :goto_4
    invoke-static {v9, v3, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :goto_5
    invoke-static {v9, v3, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :catch_2
    const-string v3, "Could not find method makeOptionalFitsSystemWindows. Oh well..."

    .line 309
    .line 310
    invoke-static {v9, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 311
    .line 312
    .line 313
    :goto_6
    const v3, 0x7f0a005a

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    check-cast v3, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 321
    .line 322
    iget-object v9, p0, La/pd3;->l:Landroid/view/Window;

    .line 323
    .line 324
    const v10, 0x1020002

    .line 325
    .line 326
    .line 327
    invoke-virtual {v9, v10}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    check-cast v9, Landroid/view/ViewGroup;

    .line 332
    .line 333
    if-eqz v9, :cond_f

    .line 334
    .line 335
    :goto_7
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    if-lez v11, :cond_e

    .line 340
    .line 341
    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object v11

    .line 345
    invoke-virtual {v9, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 349
    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_e
    const/4 v11, -0x1

    .line 353
    invoke-virtual {v9, v11}, Landroid/view/View;->setId(I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v3, v10}, Landroid/view/View;->setId(I)V

    .line 357
    .line 358
    .line 359
    instance-of v11, v9, Landroid/widget/FrameLayout;

    .line 360
    .line 361
    if-eqz v11, :cond_f

    .line 362
    .line 363
    check-cast v9, Landroid/widget/FrameLayout;

    .line 364
    .line 365
    invoke-virtual {v9, v8}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 366
    .line 367
    .line 368
    :cond_f
    iget-object v8, p0, La/pd3;->l:Landroid/view/Window;

    .line 369
    .line 370
    invoke-virtual {v8, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 371
    .line 372
    .line 373
    new-instance v8, La/h03;

    .line 374
    .line 375
    const/16 v9, 0xb

    .line 376
    .line 377
    invoke-direct {v8, p0, v9}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3, v8}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(La/cee;)V

    .line 381
    .line 382
    .line 383
    iput-object v2, p0, La/pd3;->z:Landroid/view/ViewGroup;

    .line 384
    .line 385
    iget-object v2, p0, La/pd3;->j:Ljava/lang/Object;

    .line 386
    .line 387
    instance-of v3, v2, Landroid/app/Activity;

    .line 388
    .line 389
    if-eqz v3, :cond_10

    .line 390
    .line 391
    check-cast v2, Landroid/app/Activity;

    .line 392
    .line 393
    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    goto :goto_8

    .line 398
    :cond_10
    iget-object v2, p0, La/pd3;->p:Ljava/lang/CharSequence;

    .line 399
    .line 400
    :goto_8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    if-nez v3, :cond_13

    .line 405
    .line 406
    iget-object v3, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 407
    .line 408
    if-eqz v3, :cond_11

    .line 409
    .line 410
    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 411
    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_11
    iget-object v3, p0, La/pd3;->n:La/qhv0;

    .line 415
    .line 416
    if-eqz v3, :cond_12

    .line 417
    .line 418
    iget-object v3, v3, La/qhv0;->e:La/blj;

    .line 419
    .line 420
    check-cast v3, La/rwq0;

    .line 421
    .line 422
    iget-boolean v8, v3, La/rwq0;->g:Z

    .line 423
    .line 424
    if-nez v8, :cond_13

    .line 425
    .line 426
    iget-object v8, v3, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 427
    .line 428
    iput-object v2, v3, La/rwq0;->h:Ljava/lang/CharSequence;

    .line 429
    .line 430
    iget v9, v3, La/rwq0;->b:I

    .line 431
    .line 432
    and-int/2addr v4, v9

    .line 433
    if-eqz v4, :cond_13

    .line 434
    .line 435
    invoke-virtual {v8, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 436
    .line 437
    .line 438
    iget-boolean v3, v3, La/rwq0;->g:Z

    .line 439
    .line 440
    if-eqz v3, :cond_13

    .line 441
    .line 442
    invoke-virtual {v8}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    invoke-static {v3, v2}, La/rgu0;->p(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 447
    .line 448
    .line 449
    goto :goto_9

    .line 450
    :cond_12
    iget-object v3, p0, La/pd3;->A:Landroid/widget/TextView;

    .line 451
    .line 452
    if-eqz v3, :cond_13

    .line 453
    .line 454
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 455
    .line 456
    .line 457
    :cond_13
    :goto_9
    iget-object v2, p0, La/pd3;->z:Landroid/view/ViewGroup;

    .line 458
    .line 459
    invoke-virtual {v2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    check-cast v2, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 464
    .line 465
    iget-object v3, p0, La/pd3;->l:Landroid/view/Window;

    .line 466
    .line 467
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 476
    .line 477
    .line 478
    move-result v8

    .line 479
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 480
    .line 481
    .line 482
    move-result v9

    .line 483
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    iget-object v10, v2, Landroidx/appcompat/widget/ContentFrameLayout;->g:Landroid/graphics/Rect;

    .line 488
    .line 489
    invoke-virtual {v10, v4, v8, v9, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    if-eqz v3, :cond_14

    .line 497
    .line 498
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 499
    .line 500
    .line 501
    :cond_14
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    const/16 v1, 0x7c

    .line 506
    .line 507
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 512
    .line 513
    .line 514
    const/16 v1, 0x7d

    .line 515
    .line 516
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 521
    .line 522
    .line 523
    const/16 v1, 0x7a

    .line 524
    .line 525
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    if-eqz v3, :cond_15

    .line 530
    .line 531
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 536
    .line 537
    .line 538
    :cond_15
    const/16 v1, 0x7b

    .line 539
    .line 540
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    if-eqz v3, :cond_16

    .line 545
    .line 546
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 551
    .line 552
    .line 553
    :cond_16
    const/16 v1, 0x78

    .line 554
    .line 555
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    if-eqz v3, :cond_17

    .line 560
    .line 561
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 566
    .line 567
    .line 568
    :cond_17
    const/16 v1, 0x79

    .line 569
    .line 570
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    if-eqz v3, :cond_18

    .line 575
    .line 576
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 581
    .line 582
    .line 583
    :cond_18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 587
    .line 588
    .line 589
    iput-boolean v7, p0, La/pd3;->y:Z

    .line 590
    .line 591
    invoke-virtual {p0, v5}, La/pd3;->Q(I)La/od3;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    iget-boolean v1, p0, La/pd3;->p1:Z

    .line 596
    .line 597
    if-nez v1, :cond_1b

    .line 598
    .line 599
    iget-object v0, v0, La/od3;->h:La/ox30;

    .line 600
    .line 601
    if-nez v0, :cond_1b

    .line 602
    .line 603
    invoke-virtual {p0, v6}, La/pd3;->S(I)V

    .line 604
    .line 605
    .line 606
    goto :goto_a

    .line 607
    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 608
    .line 609
    const-string v1, "AppCompat does not support the current theme features: { windowActionBar: "

    .line 610
    .line 611
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    iget-boolean v1, p0, La/pd3;->Z:Z

    .line 615
    .line 616
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    const-string v1, ", windowActionBarOverlay: "

    .line 620
    .line 621
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    iget-boolean v1, p0, La/pd3;->f1:Z

    .line 625
    .line 626
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    const-string v1, ", android:windowIsFloating: "

    .line 630
    .line 631
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    iget-boolean v1, p0, La/pd3;->h1:Z

    .line 635
    .line 636
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    const-string v1, ", windowActionModeOverlay: "

    .line 640
    .line 641
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    iget-boolean v1, p0, La/pd3;->g1:Z

    .line 645
    .line 646
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    const-string v1, ", windowNoTitle: "

    .line 650
    .line 651
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    iget-boolean p0, p0, La/pd3;->i1:Z

    .line 655
    .line 656
    const-string v1, " }"

    .line 657
    .line 658
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object p0

    .line 662
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    return-void

    .line 666
    :cond_1a
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 667
    .line 668
    .line 669
    const-string p0, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    .line 670
    .line 671
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    :cond_1b
    :goto_a
    return-void
.end method

.method public final O()V
    .locals 2

    .line 1
    iget-object v0, p0, La/pd3;->l:Landroid/view/Window;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/pd3;->j:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, La/pd3;->F(Landroid/view/Window;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, La/pd3;->l:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const-string p0, "We have not been given a Window"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final P(Landroid/content/Context;)La/c2;
    .locals 3

    .line 1
    iget-object v0, p0, La/pd3;->v1:La/ld3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, La/ld3;

    .line 6
    .line 7
    sget-object v1, La/yuu;->e:La/yuu;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v1, La/yuu;

    .line 16
    .line 17
    const-string v2, "location"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/location/LocationManager;

    .line 24
    .line 25
    invoke-direct {v1, p1, v2}, La/yuu;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, La/yuu;->e:La/yuu;

    .line 29
    .line 30
    :cond_0
    invoke-direct {v0, p0, v1}, La/ld3;-><init>(La/pd3;La/yuu;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/pd3;->v1:La/ld3;

    .line 34
    .line 35
    :cond_1
    return-object v0
.end method

.method public final Q(I)La/od3;
    .locals 4

    .line 1
    iget-object v0, p0, La/pd3;->k1:[La/od3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    if-gt v2, p1, :cond_2

    .line 8
    .line 9
    :cond_0
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    new-array v2, v2, [La/od3;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    array-length v3, v0

    .line 16
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object v2, p0, La/pd3;->k1:[La/od3;

    .line 20
    .line 21
    move-object v0, v2

    .line 22
    :cond_2
    aget-object p0, v0, p1

    .line 23
    .line 24
    if-nez p0, :cond_3

    .line 25
    .line 26
    new-instance p0, La/od3;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput p1, p0, La/od3;->a:I

    .line 32
    .line 33
    iput-boolean v1, p0, La/od3;->n:Z

    .line 34
    .line 35
    aput-object p0, v0, p1

    .line 36
    .line 37
    :cond_3
    return-object p0
.end method

.method public final R()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/pd3;->N()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/pd3;->Z:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, La/pd3;->n:La/qhv0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v1, p0, La/pd3;->j:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v2, v1, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    new-instance v0, La/qhv0;

    .line 20
    .line 21
    check-cast v1, Landroid/app/Activity;

    .line 22
    .line 23
    iget-boolean v2, p0, La/pd3;->f1:Z

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, La/qhv0;-><init>(Landroid/app/Activity;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/pd3;->n:La/qhv0;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of v2, v1, Landroid/app/Dialog;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    new-instance v0, La/qhv0;

    .line 36
    .line 37
    check-cast v1, Landroid/app/Dialog;

    .line 38
    .line 39
    invoke-direct {v0, v1}, La/qhv0;-><init>(Landroid/app/Dialog;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/pd3;->n:La/qhv0;

    .line 43
    .line 44
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 45
    .line 46
    iget-boolean p0, p0, La/pd3;->A1:Z

    .line 47
    .line 48
    invoke-virtual {v0, p0}, La/qhv0;->d(Z)V

    .line 49
    .line 50
    .line 51
    :cond_3
    :goto_1
    return-void
.end method

.method public final S(I)V
    .locals 2

    .line 1
    iget v0, p0, La/pd3;->y1:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int p1, v1, p1

    .line 5
    .line 6
    or-int/2addr p1, v0

    .line 7
    iput p1, p0, La/pd3;->y1:I

    .line 8
    .line 9
    iget-boolean p1, p0, La/pd3;->x1:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, La/pd3;->l:Landroid/view/Window;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    iget-object v0, p0, La/pd3;->z1:La/id3;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v1, p0, La/pd3;->x1:Z

    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final T(ILandroid/content/Context;)I
    .locals 2

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq p1, v0, :cond_5

    .line 5
    .line 6
    if-eq p1, v1, :cond_4

    .line 7
    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p1, v0, :cond_4

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-eq p1, v0, :cond_4

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, La/pd3;->w1:La/ld3;

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    new-instance p1, La/ld3;

    .line 24
    .line 25
    invoke-direct {p1, p0, p2}, La/ld3;-><init>(La/pd3;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/pd3;->w1:La/ld3;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, La/ld3;->k()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_1
    const-string p0, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    .line 36
    .line 37
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_2
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v0, "uimode"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Landroid/app/UiModeManager;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/app/UiModeManager;->getNightMode()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {p0, p2}, La/pd3;->P(Landroid/content/Context;)La/c2;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, La/c2;->k()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    return p0

    .line 70
    :cond_4
    return p1

    .line 71
    :cond_5
    :goto_0
    return v1
.end method

.method public final U()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, La/pd3;->m1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, La/pd3;->m1:Z

    .line 5
    .line 6
    invoke-virtual {p0, v1}, La/pd3;->Q(I)La/od3;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-boolean v3, v2, La/od3;->m:Z

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0, v2, v4}, La/pd3;->J(La/od3;Z)V

    .line 18
    .line 19
    .line 20
    return v4

    .line 21
    :cond_0
    iget-object v0, p0, La/pd3;->t:La/xj;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, La/xj;->c()V

    .line 26
    .line 27
    .line 28
    return v4

    .line 29
    :cond_1
    invoke-virtual {p0}, La/pd3;->R()V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/pd3;->n:La/qhv0;

    .line 33
    .line 34
    if-eqz p0, :cond_4

    .line 35
    .line 36
    iget-object p0, p0, La/qhv0;->e:La/blj;

    .line 37
    .line 38
    if-eqz p0, :cond_4

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    check-cast v0, La/rwq0;

    .line 42
    .line 43
    iget-object v0, v0, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 44
    .line 45
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->p1:La/fwq0;

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    iget-object v0, v0, La/fwq0;->b:La/hz30;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast p0, La/rwq0;

    .line 54
    .line 55
    iget-object p0, p0, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->p1:La/fwq0;

    .line 58
    .line 59
    if-nez p0, :cond_2

    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object p0, p0, La/fwq0;->b:La/hz30;

    .line 64
    .line 65
    :goto_0
    if-eqz p0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, La/hz30;->collapseActionView()Z

    .line 68
    .line 69
    .line 70
    :cond_3
    return v4

    .line 71
    :cond_4
    return v1
.end method

.method public final V(La/od3;Landroid/view/KeyEvent;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, La/od3;->m:Z

    .line 6
    .line 7
    iget v3, v1, La/od3;->a:I

    .line 8
    .line 9
    if-nez v2, :cond_1a

    .line 10
    .line 11
    iget-boolean v2, v0, La/pd3;->p1:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_9

    .line 16
    .line 17
    :cond_0
    iget-object v2, v0, La/pd3;->k:Landroid/content/Context;

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget v4, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 30
    .line 31
    and-int/lit8 v4, v4, 0xf

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    if-ne v4, v5, :cond_1

    .line 35
    .line 36
    goto/16 :goto_9

    .line 37
    .line 38
    :cond_1
    iget-object v4, v0, La/pd3;->l:Landroid/view/Window;

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x1

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    iget-object v6, v1, La/od3;->h:La/ox30;

    .line 48
    .line 49
    invoke-interface {v4, v3, v6}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v1, v5}, La/pd3;->J(La/od3;Z)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string v4, "window"

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroid/view/WindowManager;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_3
    invoke-virtual/range {p0 .. p2}, La/pd3;->X(La/od3;Landroid/view/KeyEvent;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-nez v6, :cond_4

    .line 76
    .line 77
    goto/16 :goto_9

    .line 78
    .line 79
    :cond_4
    iget-object v6, v1, La/od3;->e:La/nd3;

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, -0x2

    .line 83
    if-eqz v6, :cond_6

    .line 84
    .line 85
    iget-boolean v9, v1, La/od3;->n:Z

    .line 86
    .line 87
    if-eqz v9, :cond_5

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    iget-object v2, v1, La/od3;->g:Landroid/view/View;

    .line 91
    .line 92
    if-eqz v2, :cond_18

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_18

    .line 99
    .line 100
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 101
    .line 102
    const/4 v6, -0x1

    .line 103
    if-ne v2, v6, :cond_18

    .line 104
    .line 105
    move v10, v6

    .line 106
    goto/16 :goto_7

    .line 107
    .line 108
    :cond_6
    :goto_0
    if-nez v6, :cond_b

    .line 109
    .line 110
    invoke-virtual {v0}, La/pd3;->R()V

    .line 111
    .line 112
    .line 113
    iget-object v6, v0, La/pd3;->n:La/qhv0;

    .line 114
    .line 115
    if-eqz v6, :cond_7

    .line 116
    .line 117
    invoke-virtual {v6}, La/qhv0;->b()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    goto :goto_1

    .line 122
    :cond_7
    const/4 v6, 0x0

    .line 123
    :goto_1
    if-nez v6, :cond_8

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    move-object v2, v6

    .line 127
    :goto_2
    new-instance v6, Landroid/util/TypedValue;

    .line 128
    .line 129
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-virtual {v9, v10}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 145
    .line 146
    .line 147
    const v10, 0x7f04001d

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 151
    .line 152
    .line 153
    iget v10, v6, Landroid/util/TypedValue;->resourceId:I

    .line 154
    .line 155
    if-eqz v10, :cond_9

    .line 156
    .line 157
    invoke-virtual {v9, v10, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 158
    .line 159
    .line 160
    :cond_9
    const v10, 0x7f0406b7

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 164
    .line 165
    .line 166
    iget v6, v6, Landroid/util/TypedValue;->resourceId:I

    .line 167
    .line 168
    if-eqz v6, :cond_a

    .line 169
    .line 170
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_a
    const v6, 0x7f1404d5

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 178
    .line 179
    .line 180
    :goto_3
    new-instance v6, La/tje;

    .line 181
    .line 182
    invoke-direct {v6, v2, v7}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6}, La/tje;->getTheme()Landroid/content/res/Resources$Theme;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 190
    .line 191
    .line 192
    iput-object v6, v1, La/od3;->j:La/tje;

    .line 193
    .line 194
    sget-object v2, La/mqd0;->j:[I

    .line 195
    .line 196
    invoke-virtual {v6, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/16 v6, 0x56

    .line 201
    .line 202
    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    iput v6, v1, La/od3;->b:I

    .line 207
    .line 208
    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    iput v6, v1, La/od3;->d:I

    .line 213
    .line 214
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 215
    .line 216
    .line 217
    new-instance v2, La/nd3;

    .line 218
    .line 219
    iget-object v6, v1, La/od3;->j:La/tje;

    .line 220
    .line 221
    invoke-direct {v2, v0, v6}, La/nd3;-><init>(La/pd3;La/tje;)V

    .line 222
    .line 223
    .line 224
    iput-object v2, v1, La/od3;->e:La/nd3;

    .line 225
    .line 226
    const/16 v2, 0x51

    .line 227
    .line 228
    iput-byte v2, v1, La/od3;->c:B

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_b
    iget-boolean v2, v1, La/od3;->n:Z

    .line 232
    .line 233
    if-eqz v2, :cond_c

    .line 234
    .line 235
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-lez v2, :cond_c

    .line 240
    .line 241
    iget-object v2, v1, La/od3;->e:La/nd3;

    .line 242
    .line 243
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 244
    .line 245
    .line 246
    :cond_c
    :goto_4
    iget-object v2, v1, La/od3;->g:Landroid/view/View;

    .line 247
    .line 248
    if-eqz v2, :cond_d

    .line 249
    .line 250
    iput-object v2, v1, La/od3;->f:Landroid/view/View;

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_d
    iget-object v2, v1, La/od3;->h:La/ox30;

    .line 254
    .line 255
    if-nez v2, :cond_e

    .line 256
    .line 257
    goto/16 :goto_8

    .line 258
    .line 259
    :cond_e
    iget-object v2, v0, La/pd3;->s:La/r7v;

    .line 260
    .line 261
    if-nez v2, :cond_f

    .line 262
    .line 263
    new-instance v2, La/r7v;

    .line 264
    .line 265
    invoke-direct {v2, v0}, La/r7v;-><init>(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    iput-object v2, v0, La/pd3;->s:La/r7v;

    .line 269
    .line 270
    :cond_f
    iget-object v6, v1, La/od3;->i:La/hf00;

    .line 271
    .line 272
    if-nez v6, :cond_10

    .line 273
    .line 274
    new-instance v6, La/hf00;

    .line 275
    .line 276
    iget-object v9, v1, La/od3;->j:La/tje;

    .line 277
    .line 278
    invoke-direct {v6, v9}, La/hf00;-><init>(Landroid/content/Context;)V

    .line 279
    .line 280
    .line 281
    iput-object v6, v1, La/od3;->i:La/hf00;

    .line 282
    .line 283
    iput-object v2, v6, La/hf00;->e:La/b040;

    .line 284
    .line 285
    iget-object v2, v1, La/od3;->h:La/ox30;

    .line 286
    .line 287
    iget-object v9, v2, La/ox30;->a:Landroid/content/Context;

    .line 288
    .line 289
    invoke-virtual {v2, v6, v9}, La/ox30;->b(La/c040;Landroid/content/Context;)V

    .line 290
    .line 291
    .line 292
    :cond_10
    iget-object v2, v1, La/od3;->i:La/hf00;

    .line 293
    .line 294
    iget-object v6, v1, La/od3;->e:La/nd3;

    .line 295
    .line 296
    iget-object v9, v2, La/hf00;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 297
    .line 298
    if-nez v9, :cond_12

    .line 299
    .line 300
    iget-object v9, v2, La/hf00;->b:Landroid/view/LayoutInflater;

    .line 301
    .line 302
    const v10, 0x7f0d000d

    .line 303
    .line 304
    .line 305
    invoke-virtual {v9, v10, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    check-cast v6, Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 310
    .line 311
    iput-object v6, v2, La/hf00;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 312
    .line 313
    iget-object v6, v2, La/hf00;->f:La/gf00;

    .line 314
    .line 315
    if-nez v6, :cond_11

    .line 316
    .line 317
    new-instance v6, La/gf00;

    .line 318
    .line 319
    invoke-direct {v6, v2}, La/gf00;-><init>(La/hf00;)V

    .line 320
    .line 321
    .line 322
    iput-object v6, v2, La/hf00;->f:La/gf00;

    .line 323
    .line 324
    :cond_11
    iget-object v9, v2, La/hf00;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 325
    .line 326
    invoke-virtual {v9, v6}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 327
    .line 328
    .line 329
    iget-object v6, v2, La/hf00;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 330
    .line 331
    invoke-virtual {v6, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 332
    .line 333
    .line 334
    :cond_12
    iget-object v2, v2, La/hf00;->d:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 335
    .line 336
    iput-object v2, v1, La/od3;->f:Landroid/view/View;

    .line 337
    .line 338
    if-eqz v2, :cond_19

    .line 339
    .line 340
    :goto_5
    iget-object v2, v1, La/od3;->f:Landroid/view/View;

    .line 341
    .line 342
    if-nez v2, :cond_13

    .line 343
    .line 344
    goto/16 :goto_8

    .line 345
    .line 346
    :cond_13
    iget-object v2, v1, La/od3;->g:Landroid/view/View;

    .line 347
    .line 348
    if-eqz v2, :cond_14

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_14
    iget-object v2, v1, La/od3;->i:La/hf00;

    .line 352
    .line 353
    iget-object v6, v2, La/hf00;->f:La/gf00;

    .line 354
    .line 355
    if-nez v6, :cond_15

    .line 356
    .line 357
    new-instance v6, La/gf00;

    .line 358
    .line 359
    invoke-direct {v6, v2}, La/gf00;-><init>(La/hf00;)V

    .line 360
    .line 361
    .line 362
    iput-object v6, v2, La/hf00;->f:La/gf00;

    .line 363
    .line 364
    :cond_15
    invoke-virtual {v6}, La/gf00;->getCount()I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    if-lez v2, :cond_19

    .line 369
    .line 370
    :goto_6
    iget-object v2, v1, La/od3;->f:Landroid/view/View;

    .line 371
    .line 372
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    if-nez v2, :cond_16

    .line 377
    .line 378
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 379
    .line 380
    invoke-direct {v2, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 381
    .line 382
    .line 383
    :cond_16
    iget v6, v1, La/od3;->b:I

    .line 384
    .line 385
    iget-object v9, v1, La/od3;->e:La/nd3;

    .line 386
    .line 387
    invoke-virtual {v9, v6}, La/nd3;->setBackgroundResource(I)V

    .line 388
    .line 389
    .line 390
    iget-object v6, v1, La/od3;->f:Landroid/view/View;

    .line 391
    .line 392
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    instance-of v9, v6, Landroid/view/ViewGroup;

    .line 397
    .line 398
    if-eqz v9, :cond_17

    .line 399
    .line 400
    check-cast v6, Landroid/view/ViewGroup;

    .line 401
    .line 402
    iget-object v9, v1, La/od3;->f:Landroid/view/View;

    .line 403
    .line 404
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 405
    .line 406
    .line 407
    :cond_17
    iget-object v6, v1, La/od3;->e:La/nd3;

    .line 408
    .line 409
    iget-object v9, v1, La/od3;->f:Landroid/view/View;

    .line 410
    .line 411
    invoke-virtual {v6, v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 412
    .line 413
    .line 414
    iget-object v2, v1, La/od3;->f:Landroid/view/View;

    .line 415
    .line 416
    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    if-nez v2, :cond_18

    .line 421
    .line 422
    iget-object v2, v1, La/od3;->f:Landroid/view/View;

    .line 423
    .line 424
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 425
    .line 426
    .line 427
    :cond_18
    move v10, v8

    .line 428
    :goto_7
    iput-boolean v7, v1, La/od3;->l:Z

    .line 429
    .line 430
    new-instance v9, Landroid/view/WindowManager$LayoutParams;

    .line 431
    .line 432
    const/high16 v15, 0x820000

    .line 433
    .line 434
    const/16 v16, -0x3

    .line 435
    .line 436
    const/4 v11, -0x2

    .line 437
    const/4 v12, 0x0

    .line 438
    const/4 v13, 0x0

    .line 439
    const/16 v14, 0x3ea

    .line 440
    .line 441
    invoke-direct/range {v9 .. v16}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 442
    .line 443
    .line 444
    iget-byte v2, v1, La/od3;->c:B

    .line 445
    .line 446
    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 447
    .line 448
    iget v2, v1, La/od3;->d:I

    .line 449
    .line 450
    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 451
    .line 452
    iget-object v2, v1, La/od3;->e:La/nd3;

    .line 453
    .line 454
    invoke-interface {v4, v2, v9}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 455
    .line 456
    .line 457
    iput-boolean v5, v1, La/od3;->m:Z

    .line 458
    .line 459
    if-nez v3, :cond_1a

    .line 460
    .line 461
    invoke-virtual {v0}, La/pd3;->Z()V

    .line 462
    .line 463
    .line 464
    return-void

    .line 465
    :cond_19
    :goto_8
    iput-boolean v5, v1, La/od3;->n:Z

    .line 466
    .line 467
    :cond_1a
    :goto_9
    return-void
.end method

.method public final W(La/od3;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v0, p1, La/od3;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3}, La/pd3;->X(La/od3;Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-object p0, p1, La/od3;->h:La/ox30;

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    invoke-virtual {p0, p2, p3, p1}, La/ox30;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :cond_2
    return v1
.end method

.method public final X(La/od3;Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1
    iget-boolean v0, p0, La/pd3;->p1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_5

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p1, La/od3;->k:Z

    .line 9
    .line 10
    iget v2, p1, La/od3;->a:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v3

    .line 16
    :cond_1
    iget-object v0, p0, La/pd3;->l1:La/od3;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    if-eq v0, p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, La/pd3;->J(La/od3;Z)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/pd3;->l:Landroid/view/Window;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {v0, v2}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iput-object v4, p1, La/od3;->g:Landroid/view/View;

    .line 38
    .line 39
    :cond_3
    const/16 v4, 0x6c

    .line 40
    .line 41
    if-eqz v2, :cond_5

    .line 42
    .line 43
    if-ne v2, v4, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    move v5, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_5
    :goto_0
    move v5, v3

    .line 49
    :goto_1
    if-eqz v5, :cond_6

    .line 50
    .line 51
    iget-object v6, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 52
    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 56
    .line 57
    .line 58
    iget-object v6, v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 59
    .line 60
    check-cast v6, La/rwq0;

    .line 61
    .line 62
    iput-boolean v3, v6, La/rwq0;->l:Z

    .line 63
    .line 64
    :cond_6
    iget-object v6, p1, La/od3;->g:Landroid/view/View;

    .line 65
    .line 66
    if-nez v6, :cond_1d

    .line 67
    .line 68
    iget-object v6, p1, La/od3;->h:La/ox30;

    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    if-eqz v6, :cond_7

    .line 72
    .line 73
    iget-boolean v8, p1, La/od3;->o:Z

    .line 74
    .line 75
    if-eqz v8, :cond_17

    .line 76
    .line 77
    :cond_7
    if-nez v6, :cond_10

    .line 78
    .line 79
    iget-object v6, p0, La/pd3;->k:Landroid/content/Context;

    .line 80
    .line 81
    if-eqz v2, :cond_8

    .line 82
    .line 83
    if-ne v2, v4, :cond_c

    .line 84
    .line 85
    :cond_8
    iget-object v4, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 86
    .line 87
    if-eqz v4, :cond_c

    .line 88
    .line 89
    new-instance v4, Landroid/util/TypedValue;

    .line 90
    .line 91
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    const v9, 0x7f040024

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v9, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 102
    .line 103
    .line 104
    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    .line 105
    .line 106
    const v10, 0x7f040025

    .line 107
    .line 108
    .line 109
    if-eqz v9, :cond_9

    .line 110
    .line 111
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 120
    .line 121
    .line 122
    iget v11, v4, Landroid/util/TypedValue;->resourceId:I

    .line 123
    .line 124
    invoke-virtual {v9, v11, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_9
    invoke-virtual {v8, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 132
    .line 133
    .line 134
    move-object v9, v7

    .line 135
    :goto_2
    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    .line 136
    .line 137
    if-eqz v10, :cond_b

    .line 138
    .line 139
    if-nez v9, :cond_a

    .line 140
    .line 141
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 150
    .line 151
    .line 152
    :cond_a
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    .line 153
    .line 154
    invoke-virtual {v9, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 155
    .line 156
    .line 157
    :cond_b
    if-eqz v9, :cond_c

    .line 158
    .line 159
    new-instance v4, La/tje;

    .line 160
    .line 161
    invoke-direct {v4, v6, v1}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4}, La/tje;->getTheme()Landroid/content/res/Resources$Theme;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-virtual {v6, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 169
    .line 170
    .line 171
    move-object v6, v4

    .line 172
    :cond_c
    new-instance v4, La/ox30;

    .line 173
    .line 174
    invoke-direct {v4, v6}, La/ox30;-><init>(Landroid/content/Context;)V

    .line 175
    .line 176
    .line 177
    iput-object p0, v4, La/ox30;->e:La/mx30;

    .line 178
    .line 179
    iget-object v6, p1, La/od3;->h:La/ox30;

    .line 180
    .line 181
    if-ne v4, v6, :cond_d

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_d
    if-eqz v6, :cond_e

    .line 185
    .line 186
    iget-object v8, p1, La/od3;->i:La/hf00;

    .line 187
    .line 188
    invoke-virtual {v6, v8}, La/ox30;->r(La/c040;)V

    .line 189
    .line 190
    .line 191
    :cond_e
    iput-object v4, p1, La/od3;->h:La/ox30;

    .line 192
    .line 193
    iget-object v6, p1, La/od3;->i:La/hf00;

    .line 194
    .line 195
    if-eqz v6, :cond_f

    .line 196
    .line 197
    iget-object v8, v4, La/ox30;->a:Landroid/content/Context;

    .line 198
    .line 199
    invoke-virtual {v4, v6, v8}, La/ox30;->b(La/c040;Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    :cond_f
    :goto_3
    iget-object v6, p1, La/od3;->h:La/ox30;

    .line 203
    .line 204
    if-nez v6, :cond_10

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_10
    if-eqz v5, :cond_12

    .line 208
    .line 209
    iget-object v4, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 210
    .line 211
    if-eqz v4, :cond_12

    .line 212
    .line 213
    iget-object v8, p0, La/pd3;->r:La/wsf0;

    .line 214
    .line 215
    if-nez v8, :cond_11

    .line 216
    .line 217
    new-instance v8, La/wsf0;

    .line 218
    .line 219
    const/4 v9, 0x7

    .line 220
    invoke-direct {v8, p0, v9}, La/wsf0;-><init>(Ljava/lang/Object;B)V

    .line 221
    .line 222
    .line 223
    iput-object v8, p0, La/pd3;->r:La/wsf0;

    .line 224
    .line 225
    :cond_11
    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(La/ox30;La/b040;)V

    .line 226
    .line 227
    .line 228
    :cond_12
    iget-object v4, p1, La/od3;->h:La/ox30;

    .line 229
    .line 230
    invoke-virtual {v4}, La/ox30;->w()V

    .line 231
    .line 232
    .line 233
    iget-object v4, p1, La/od3;->h:La/ox30;

    .line 234
    .line 235
    invoke-interface {v0, v2, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-nez v2, :cond_16

    .line 240
    .line 241
    iget-object p2, p1, La/od3;->h:La/ox30;

    .line 242
    .line 243
    if-nez p2, :cond_13

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_13
    if-eqz p2, :cond_14

    .line 247
    .line 248
    iget-object v0, p1, La/od3;->i:La/hf00;

    .line 249
    .line 250
    invoke-virtual {p2, v0}, La/ox30;->r(La/c040;)V

    .line 251
    .line 252
    .line 253
    :cond_14
    iput-object v7, p1, La/od3;->h:La/ox30;

    .line 254
    .line 255
    :goto_4
    if-eqz v5, :cond_15

    .line 256
    .line 257
    iget-object p1, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 258
    .line 259
    if-eqz p1, :cond_15

    .line 260
    .line 261
    iget-object p0, p0, La/pd3;->r:La/wsf0;

    .line 262
    .line 263
    invoke-virtual {p1, v7, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(La/ox30;La/b040;)V

    .line 264
    .line 265
    .line 266
    :cond_15
    :goto_5
    return v1

    .line 267
    :cond_16
    iput-boolean v1, p1, La/od3;->o:Z

    .line 268
    .line 269
    :cond_17
    iget-object v2, p1, La/od3;->h:La/ox30;

    .line 270
    .line 271
    invoke-virtual {v2}, La/ox30;->w()V

    .line 272
    .line 273
    .line 274
    iget-object v2, p1, La/od3;->p:Landroid/os/Bundle;

    .line 275
    .line 276
    if-eqz v2, :cond_18

    .line 277
    .line 278
    iget-object v4, p1, La/od3;->h:La/ox30;

    .line 279
    .line 280
    invoke-virtual {v4, v2}, La/ox30;->s(Landroid/os/Bundle;)V

    .line 281
    .line 282
    .line 283
    iput-object v7, p1, La/od3;->p:Landroid/os/Bundle;

    .line 284
    .line 285
    :cond_18
    iget-object v2, p1, La/od3;->g:Landroid/view/View;

    .line 286
    .line 287
    iget-object v4, p1, La/od3;->h:La/ox30;

    .line 288
    .line 289
    invoke-interface {v0, v1, v2, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-nez v0, :cond_1a

    .line 294
    .line 295
    if-eqz v5, :cond_19

    .line 296
    .line 297
    iget-object p2, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 298
    .line 299
    if-eqz p2, :cond_19

    .line 300
    .line 301
    iget-object p0, p0, La/pd3;->r:La/wsf0;

    .line 302
    .line 303
    invoke-virtual {p2, v7, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(La/ox30;La/b040;)V

    .line 304
    .line 305
    .line 306
    :cond_19
    iget-object p0, p1, La/od3;->h:La/ox30;

    .line 307
    .line 308
    invoke-virtual {p0}, La/ox30;->v()V

    .line 309
    .line 310
    .line 311
    return v1

    .line 312
    :cond_1a
    if-eqz p2, :cond_1b

    .line 313
    .line 314
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 315
    .line 316
    .line 317
    move-result p2

    .line 318
    goto :goto_6

    .line 319
    :cond_1b
    const/4 p2, -0x1

    .line 320
    :goto_6
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 321
    .line 322
    .line 323
    move-result-object p2

    .line 324
    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 325
    .line 326
    .line 327
    move-result p2

    .line 328
    if-eq p2, v3, :cond_1c

    .line 329
    .line 330
    move p2, v3

    .line 331
    goto :goto_7

    .line 332
    :cond_1c
    move p2, v1

    .line 333
    :goto_7
    iget-object v0, p1, La/od3;->h:La/ox30;

    .line 334
    .line 335
    invoke-virtual {v0, p2}, La/ox30;->setQwertyMode(Z)V

    .line 336
    .line 337
    .line 338
    iget-object p2, p1, La/od3;->h:La/ox30;

    .line 339
    .line 340
    invoke-virtual {p2}, La/ox30;->v()V

    .line 341
    .line 342
    .line 343
    :cond_1d
    iput-boolean v3, p1, La/od3;->k:Z

    .line 344
    .line 345
    iput-boolean v1, p1, La/od3;->l:Z

    .line 346
    .line 347
    iput-object p1, p0, La/pd3;->l1:La/od3;

    .line 348
    .line 349
    return v3
.end method

.method public final Y()V
    .locals 1

    .line 1
    iget-boolean p0, p0, La/pd3;->y:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 7
    .line 8
    const-string v0, "Window feature must be requested before adding content"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public final Z()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, La/pd3;->E1:Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p0, v2}, La/pd3;->Q(I)La/od3;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-boolean v0, v0, La/od3;->m:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :goto_0
    move v2, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object v0, p0, La/pd3;->t:La/xj;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, La/pd3;->F1:La/ma3;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, La/pd3;->E1:Landroid/window/OnBackInvokedDispatcher;

    .line 36
    .line 37
    new-instance v2, La/ma3;

    .line 38
    .line 39
    invoke-direct {v2, p0, v1}, La/ma3;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, La/c7;->g(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0, v2}, La/c7;->o(Landroid/window/OnBackInvokedDispatcher;La/ma3;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, La/pd3;->F1:La/ma3;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    if-nez v2, :cond_4

    .line 53
    .line 54
    iget-object v0, p0, La/pd3;->F1:La/ma3;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object v1, p0, La/pd3;->E1:Landroid/window/OnBackInvokedDispatcher;

    .line 59
    .line 60
    invoke-static {v0}, La/c7;->e(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v1}, La/c7;->g(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1, v0}, La/c7;->p(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, La/pd3;->F1:La/ma3;

    .line 73
    .line 74
    :cond_4
    return-void
.end method

.method public final a(La/ox30;)V
    .locals 5

    .line 1
    iget-object p1, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 11
    .line 12
    check-cast p1, La/rwq0;

    .line 13
    .line 14
    iget-object p1, p1, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_5

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz p1, :cond_5

    .line 25
    .line 26
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionMenuView;->s:Z

    .line 27
    .line 28
    if-eqz p1, :cond_5

    .line 29
    .line 30
    iget-object p1, p0, La/pd3;->k:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    iget-object p1, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 45
    .line 46
    .line 47
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 48
    .line 49
    check-cast p1, La/rwq0;

    .line 50
    .line 51
    iget-object p1, p1, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 52
    .line 53
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 54
    .line 55
    if-eqz p1, :cond_5

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 58
    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget-object v2, p1, La/xi;->u:La/lfr;

    .line 62
    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    invoke-virtual {p1}, La/xi;->k()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    :cond_0
    iget-object p1, p0, La/pd3;->l:Landroid/view/Window;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v2, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 78
    .line 79
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 80
    .line 81
    .line 82
    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 83
    .line 84
    check-cast v2, La/rwq0;

    .line 85
    .line 86
    iget-object v2, v2, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 87
    .line 88
    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 89
    .line 90
    const/16 v3, 0x6c

    .line 91
    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    iget-object v2, v2, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 95
    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    invoke-virtual {v2}, La/xi;->k()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    iget-object v0, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 107
    .line 108
    .line 109
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 110
    .line 111
    check-cast v0, La/rwq0;

    .line 112
    .line 113
    iget-object v0, v0, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 114
    .line 115
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 116
    .line 117
    if-eqz v0, :cond_1

    .line 118
    .line 119
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 120
    .line 121
    if-eqz v0, :cond_1

    .line 122
    .line 123
    invoke-virtual {v0}, La/xi;->j()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    :cond_1
    iget-boolean v0, p0, La/pd3;->p1:Z

    .line 128
    .line 129
    if-nez v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0, v1}, La/pd3;->Q(I)La/od3;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object p0, p0, La/od3;->h:La/ox30;

    .line 136
    .line 137
    invoke-interface {p1, v3, p0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_2
    if-eqz p1, :cond_4

    .line 142
    .line 143
    iget-boolean v2, p0, La/pd3;->p1:Z

    .line 144
    .line 145
    if-nez v2, :cond_4

    .line 146
    .line 147
    iget-boolean v2, p0, La/pd3;->x1:Z

    .line 148
    .line 149
    if-eqz v2, :cond_3

    .line 150
    .line 151
    iget v2, p0, La/pd3;->y1:I

    .line 152
    .line 153
    and-int/2addr v0, v2

    .line 154
    if-eqz v0, :cond_3

    .line 155
    .line 156
    iget-object v0, p0, La/pd3;->l:Landroid/view/Window;

    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v2, p0, La/pd3;->z1:La/id3;

    .line 163
    .line 164
    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, La/id3;->run()V

    .line 168
    .line 169
    .line 170
    :cond_3
    invoke-virtual {p0, v1}, La/pd3;->Q(I)La/od3;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v2, v0, La/od3;->h:La/ox30;

    .line 175
    .line 176
    if-eqz v2, :cond_4

    .line 177
    .line 178
    iget-boolean v4, v0, La/od3;->o:Z

    .line 179
    .line 180
    if-nez v4, :cond_4

    .line 181
    .line 182
    iget-object v4, v0, La/od3;->g:Landroid/view/View;

    .line 183
    .line 184
    invoke-interface {p1, v1, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_4

    .line 189
    .line 190
    iget-object v0, v0, La/od3;->h:La/ox30;

    .line 191
    .line 192
    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 193
    .line 194
    .line 195
    iget-object p0, p0, La/pd3;->q:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 196
    .line 197
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()V

    .line 198
    .line 199
    .line 200
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->e:La/blj;

    .line 201
    .line 202
    check-cast p0, La/rwq0;

    .line 203
    .line 204
    iget-object p0, p0, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 205
    .line 206
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 207
    .line 208
    if-eqz p0, :cond_4

    .line 209
    .line 210
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->t:La/xi;

    .line 211
    .line 212
    if-eqz p0, :cond_4

    .line 213
    .line 214
    invoke-virtual {p0}, La/xi;->l()Z

    .line 215
    .line 216
    .line 217
    :cond_4
    return-void

    .line 218
    :cond_5
    invoke-virtual {p0, v1}, La/pd3;->Q(I)La/od3;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    iput-boolean v0, p1, La/od3;->n:Z

    .line 223
    .line 224
    invoke-virtual {p0, p1, v1}, La/pd3;->J(La/od3;Z)V

    .line 225
    .line 226
    .line 227
    const/4 v0, 0x0

    .line 228
    invoke-virtual {p0, p1, v0}, La/pd3;->V(La/od3;Landroid/view/KeyEvent;)V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method public final c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/pd3;->N()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/pd3;->z:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, La/pd3;->m:La/kd3;

    .line 19
    .line 20
    iget-object p0, p0, La/pd3;->l:Landroid/view/Window;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p1, p0}, La/kd3;->a(Landroid/view/Window$Callback;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final e(Landroid/content/Context;)Landroid/content/Context;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/pd3;->n1:Z

    .line 3
    .line 4
    iget v1, p0, La/pd3;->r1:I

    .line 5
    .line 6
    const/16 v2, -0x64

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget v1, La/hd3;->b:I

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, v1, p1}, La/pd3;->T(ILandroid/content/Context;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p1}, La/hd3;->o(Landroid/content/Context;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_7

    .line 23
    .line 24
    invoke-static {p1}, La/hd3;->o(Landroid/content/Context;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    const/16 v3, 0x21

    .line 34
    .line 35
    if-lt v1, v3, :cond_2

    .line 36
    .line 37
    sget-boolean v1, La/hd3;->f:Z

    .line 38
    .line 39
    if-nez v1, :cond_7

    .line 40
    .line 41
    sget-object v1, La/hd3;->a:La/gd3;

    .line 42
    .line 43
    new-instance v3, La/fd3;

    .line 44
    .line 45
    invoke-direct {v3, p1, v2}, La/fd3;-><init>(Landroid/content/Context;B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v3}, La/gd3;->execute(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_2
    sget-object v1, La/hd3;->i:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v1

    .line 55
    :try_start_0
    sget-object v3, La/hd3;->c:La/ss00;

    .line 56
    .line 57
    if-nez v3, :cond_5

    .line 58
    .line 59
    sget-object v3, La/hd3;->d:La/ss00;

    .line 60
    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    invoke-static {p1}, La/jd8;->j0(Landroid/content/Context;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v3}, La/ss00;->a(Ljava/lang/String;)La/ss00;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    sput-object v3, La/hd3;->d:La/ss00;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception p0

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    :goto_1
    invoke-virtual {v3}, La/ss00;->b()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    monitor-exit v1

    .line 83
    goto :goto_4

    .line 84
    :cond_4
    sget-object v3, La/hd3;->d:La/ss00;

    .line 85
    .line 86
    sput-object v3, La/hd3;->c:La/ss00;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    sget-object v4, La/hd3;->d:La/ss00;

    .line 90
    .line 91
    invoke-virtual {v3, v4}, La/ss00;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_6

    .line 96
    .line 97
    sget-object v3, La/hd3;->c:La/ss00;

    .line 98
    .line 99
    sput-object v3, La/hd3;->d:La/ss00;

    .line 100
    .line 101
    iget-object v3, v3, La/ss00;->a:La/ts00;

    .line 102
    .line 103
    iget-object v3, v3, La/ts00;->a:Landroid/os/LocaleList;

    .line 104
    .line 105
    invoke-virtual {v3}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-static {p1, v3}, La/jd8;->g0(Landroid/content/Context;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_6
    :goto_2
    monitor-exit v1

    .line 113
    goto :goto_4

    .line 114
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    throw p0

    .line 116
    :cond_7
    :goto_4
    invoke-static {p1}, La/pd3;->G(Landroid/content/Context;)La/ss00;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    .line 121
    .line 122
    const/4 v4, 0x0

    .line 123
    if-eqz v3, :cond_8

    .line 124
    .line 125
    invoke-static {p1, p0, v1, v4, v2}, La/pd3;->K(Landroid/content/Context;ILa/ss00;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    :try_start_1
    move-object v5, p1

    .line 130
    check-cast v5, Landroid/view/ContextThemeWrapper;

    .line 131
    .line 132
    invoke-virtual {v5, v3}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 133
    .line 134
    .line 135
    return-object p1

    .line 136
    :catch_0
    :cond_8
    instance-of v3, p1, La/tje;

    .line 137
    .line 138
    if-eqz v3, :cond_9

    .line 139
    .line 140
    invoke-static {p1, p0, v1, v4, v2}, La/pd3;->K(Landroid/content/Context;ILa/ss00;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    :try_start_2
    move-object v3, p1

    .line 145
    check-cast v3, La/tje;

    .line 146
    .line 147
    invoke-virtual {v3, v2}, La/tje;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :catch_1
    :cond_9
    sget-boolean v2, La/pd3;->I1:Z

    .line 152
    .line 153
    if-nez v2, :cond_a

    .line 154
    .line 155
    return-object p1

    .line 156
    :cond_a
    new-instance v2, Landroid/content/res/Configuration;

    .line 157
    .line 158
    invoke-direct {v2}, Landroid/content/res/Configuration;-><init>()V

    .line 159
    .line 160
    .line 161
    const/4 v3, -0x1

    .line 162
    iput v3, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 163
    .line 164
    const/4 v3, 0x0

    .line 165
    iput v3, v2, Landroid/content/res/Configuration;->fontScale:F

    .line 166
    .line 167
    invoke-virtual {p1, v2}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    iget v6, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 188
    .line 189
    iput v6, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 190
    .line 191
    invoke-virtual {v2, v5}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-nez v6, :cond_21

    .line 196
    .line 197
    new-instance v6, Landroid/content/res/Configuration;

    .line 198
    .line 199
    invoke-direct {v6}, Landroid/content/res/Configuration;-><init>()V

    .line 200
    .line 201
    .line 202
    iput v3, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 203
    .line 204
    invoke-virtual {v2, v5}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_b

    .line 209
    .line 210
    goto/16 :goto_5

    .line 211
    .line 212
    :cond_b
    iget v3, v2, Landroid/content/res/Configuration;->fontScale:F

    .line 213
    .line 214
    iget v7, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 215
    .line 216
    cmpl-float v3, v3, v7

    .line 217
    .line 218
    if-eqz v3, :cond_c

    .line 219
    .line 220
    iput v7, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 221
    .line 222
    :cond_c
    iget v3, v2, Landroid/content/res/Configuration;->mcc:I

    .line 223
    .line 224
    iget v7, v5, Landroid/content/res/Configuration;->mcc:I

    .line 225
    .line 226
    if-eq v3, v7, :cond_d

    .line 227
    .line 228
    iput v7, v6, Landroid/content/res/Configuration;->mcc:I

    .line 229
    .line 230
    :cond_d
    iget v3, v2, Landroid/content/res/Configuration;->mnc:I

    .line 231
    .line 232
    iget v7, v5, Landroid/content/res/Configuration;->mnc:I

    .line 233
    .line 234
    if-eq v3, v7, :cond_e

    .line 235
    .line 236
    iput v7, v6, Landroid/content/res/Configuration;->mnc:I

    .line 237
    .line 238
    :cond_e
    invoke-virtual {v2}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-virtual {v5}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-virtual {v3, v7}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-nez v3, :cond_f

    .line 251
    .line 252
    invoke-virtual {v6, v7}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 253
    .line 254
    .line 255
    iget-object v3, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 256
    .line 257
    iput-object v3, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 258
    .line 259
    :cond_f
    iget v3, v2, Landroid/content/res/Configuration;->touchscreen:I

    .line 260
    .line 261
    iget v7, v5, Landroid/content/res/Configuration;->touchscreen:I

    .line 262
    .line 263
    if-eq v3, v7, :cond_10

    .line 264
    .line 265
    iput v7, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 266
    .line 267
    :cond_10
    iget v3, v2, Landroid/content/res/Configuration;->keyboard:I

    .line 268
    .line 269
    iget v7, v5, Landroid/content/res/Configuration;->keyboard:I

    .line 270
    .line 271
    if-eq v3, v7, :cond_11

    .line 272
    .line 273
    iput v7, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 274
    .line 275
    :cond_11
    iget v3, v2, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 276
    .line 277
    iget v7, v5, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 278
    .line 279
    if-eq v3, v7, :cond_12

    .line 280
    .line 281
    iput v7, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 282
    .line 283
    :cond_12
    iget v3, v2, Landroid/content/res/Configuration;->navigation:I

    .line 284
    .line 285
    iget v7, v5, Landroid/content/res/Configuration;->navigation:I

    .line 286
    .line 287
    if-eq v3, v7, :cond_13

    .line 288
    .line 289
    iput v7, v6, Landroid/content/res/Configuration;->navigation:I

    .line 290
    .line 291
    :cond_13
    iget v3, v2, Landroid/content/res/Configuration;->navigationHidden:I

    .line 292
    .line 293
    iget v7, v5, Landroid/content/res/Configuration;->navigationHidden:I

    .line 294
    .line 295
    if-eq v3, v7, :cond_14

    .line 296
    .line 297
    iput v7, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 298
    .line 299
    :cond_14
    iget v3, v2, Landroid/content/res/Configuration;->orientation:I

    .line 300
    .line 301
    iget v7, v5, Landroid/content/res/Configuration;->orientation:I

    .line 302
    .line 303
    if-eq v3, v7, :cond_15

    .line 304
    .line 305
    iput v7, v6, Landroid/content/res/Configuration;->orientation:I

    .line 306
    .line 307
    :cond_15
    iget v3, v2, Landroid/content/res/Configuration;->screenLayout:I

    .line 308
    .line 309
    and-int/lit8 v3, v3, 0xf

    .line 310
    .line 311
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 312
    .line 313
    and-int/lit8 v7, v7, 0xf

    .line 314
    .line 315
    if-eq v3, v7, :cond_16

    .line 316
    .line 317
    iget v3, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 318
    .line 319
    or-int/2addr v3, v7

    .line 320
    iput v3, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 321
    .line 322
    :cond_16
    iget v3, v2, Landroid/content/res/Configuration;->screenLayout:I

    .line 323
    .line 324
    and-int/lit16 v3, v3, 0xc0

    .line 325
    .line 326
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 327
    .line 328
    and-int/lit16 v7, v7, 0xc0

    .line 329
    .line 330
    if-eq v3, v7, :cond_17

    .line 331
    .line 332
    iget v3, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 333
    .line 334
    or-int/2addr v3, v7

    .line 335
    iput v3, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 336
    .line 337
    :cond_17
    iget v3, v2, Landroid/content/res/Configuration;->screenLayout:I

    .line 338
    .line 339
    and-int/lit8 v3, v3, 0x30

    .line 340
    .line 341
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 342
    .line 343
    and-int/lit8 v7, v7, 0x30

    .line 344
    .line 345
    if-eq v3, v7, :cond_18

    .line 346
    .line 347
    iget v3, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 348
    .line 349
    or-int/2addr v3, v7

    .line 350
    iput v3, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 351
    .line 352
    :cond_18
    iget v3, v2, Landroid/content/res/Configuration;->screenLayout:I

    .line 353
    .line 354
    and-int/lit16 v3, v3, 0x300

    .line 355
    .line 356
    iget v7, v5, Landroid/content/res/Configuration;->screenLayout:I

    .line 357
    .line 358
    and-int/lit16 v7, v7, 0x300

    .line 359
    .line 360
    if-eq v3, v7, :cond_19

    .line 361
    .line 362
    iget v3, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 363
    .line 364
    or-int/2addr v3, v7

    .line 365
    iput v3, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 366
    .line 367
    :cond_19
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 368
    .line 369
    const/16 v7, 0x1a

    .line 370
    .line 371
    if-lt v3, v7, :cond_1b

    .line 372
    .line 373
    invoke-static {v2}, La/y6;->a(Landroid/content/res/Configuration;)I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    and-int/lit8 v3, v3, 0x3

    .line 378
    .line 379
    invoke-static {v5}, La/y6;->a(Landroid/content/res/Configuration;)I

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    and-int/lit8 v7, v7, 0x3

    .line 384
    .line 385
    if-eq v3, v7, :cond_1a

    .line 386
    .line 387
    invoke-static {v6}, La/y6;->a(Landroid/content/res/Configuration;)I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    invoke-static {v5}, La/y6;->a(Landroid/content/res/Configuration;)I

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    and-int/lit8 v7, v7, 0x3

    .line 396
    .line 397
    or-int/2addr v3, v7

    .line 398
    invoke-static {v6, v3}, La/y6;->l(Landroid/content/res/Configuration;I)V

    .line 399
    .line 400
    .line 401
    :cond_1a
    invoke-static {v2}, La/y6;->a(Landroid/content/res/Configuration;)I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    and-int/lit8 v3, v3, 0xc

    .line 406
    .line 407
    invoke-static {v5}, La/y6;->a(Landroid/content/res/Configuration;)I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    and-int/lit8 v7, v7, 0xc

    .line 412
    .line 413
    if-eq v3, v7, :cond_1b

    .line 414
    .line 415
    invoke-static {v6}, La/y6;->a(Landroid/content/res/Configuration;)I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    invoke-static {v5}, La/y6;->a(Landroid/content/res/Configuration;)I

    .line 420
    .line 421
    .line 422
    move-result v7

    .line 423
    and-int/lit8 v7, v7, 0xc

    .line 424
    .line 425
    or-int/2addr v3, v7

    .line 426
    invoke-static {v6, v3}, La/y6;->l(Landroid/content/res/Configuration;I)V

    .line 427
    .line 428
    .line 429
    :cond_1b
    iget v3, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 430
    .line 431
    and-int/lit8 v3, v3, 0xf

    .line 432
    .line 433
    iget v7, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 434
    .line 435
    and-int/lit8 v7, v7, 0xf

    .line 436
    .line 437
    if-eq v3, v7, :cond_1c

    .line 438
    .line 439
    iget v3, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 440
    .line 441
    or-int/2addr v3, v7

    .line 442
    iput v3, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 443
    .line 444
    :cond_1c
    iget v3, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 445
    .line 446
    and-int/lit8 v3, v3, 0x30

    .line 447
    .line 448
    iget v7, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 449
    .line 450
    and-int/lit8 v7, v7, 0x30

    .line 451
    .line 452
    if-eq v3, v7, :cond_1d

    .line 453
    .line 454
    iget v3, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 455
    .line 456
    or-int/2addr v3, v7

    .line 457
    iput v3, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 458
    .line 459
    :cond_1d
    iget v3, v2, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 460
    .line 461
    iget v7, v5, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 462
    .line 463
    if-eq v3, v7, :cond_1e

    .line 464
    .line 465
    iput v7, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 466
    .line 467
    :cond_1e
    iget v3, v2, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 468
    .line 469
    iget v7, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 470
    .line 471
    if-eq v3, v7, :cond_1f

    .line 472
    .line 473
    iput v7, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 474
    .line 475
    :cond_1f
    iget v3, v2, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 476
    .line 477
    iget v7, v5, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 478
    .line 479
    if-eq v3, v7, :cond_20

    .line 480
    .line 481
    iput v7, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 482
    .line 483
    :cond_20
    iget v2, v2, Landroid/content/res/Configuration;->densityDpi:I

    .line 484
    .line 485
    iget v3, v5, Landroid/content/res/Configuration;->densityDpi:I

    .line 486
    .line 487
    if-eq v2, v3, :cond_22

    .line 488
    .line 489
    iput v3, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 490
    .line 491
    goto :goto_5

    .line 492
    :cond_21
    move-object v6, v4

    .line 493
    :cond_22
    :goto_5
    invoke-static {p1, p0, v1, v6, v0}, La/pd3;->K(Landroid/content/Context;ILa/ss00;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    new-instance v1, La/tje;

    .line 498
    .line 499
    const v2, 0x7f1404e1

    .line 500
    .line 501
    .line 502
    invoke-direct {v1, p1, v2}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1, p0}, La/tje;->a(Landroid/content/res/Configuration;)V

    .line 506
    .line 507
    .line 508
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 509
    .line 510
    .line 511
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_5

    .line 512
    if-eqz p0, :cond_26

    .line 513
    .line 514
    invoke-virtual {v1}, La/tje;->getTheme()Landroid/content/res/Resources$Theme;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 519
    .line 520
    const/16 v2, 0x1d

    .line 521
    .line 522
    if-lt p1, v2, :cond_23

    .line 523
    .line 524
    invoke-static {p0}, La/sf3;->t(Landroid/content/res/Resources$Theme;)V

    .line 525
    .line 526
    .line 527
    goto :goto_a

    .line 528
    :cond_23
    sget-object p1, La/eeq;->n:Ljava/lang/Object;

    .line 529
    .line 530
    monitor-enter p1

    .line 531
    :try_start_4
    sget-boolean v2, La/eeq;->p:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 532
    .line 533
    if-nez v2, :cond_24

    .line 534
    .line 535
    :try_start_5
    const-class v2, Landroid/content/res/Resources$Theme;

    .line 536
    .line 537
    const-string v3, "rebase"

    .line 538
    .line 539
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    sput-object v2, La/eeq;->o:Ljava/lang/reflect/Method;

    .line 544
    .line 545
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 546
    .line 547
    .line 548
    goto :goto_6

    .line 549
    :catchall_1
    move-exception p0

    .line 550
    goto :goto_9

    .line 551
    :catch_2
    move-exception v2

    .line 552
    :try_start_6
    const-string v3, "ResourcesCompat"

    .line 553
    .line 554
    const-string v5, "Failed to retrieve rebase() method"

    .line 555
    .line 556
    invoke-static {v3, v5, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 557
    .line 558
    .line 559
    :goto_6
    sput-boolean v0, La/eeq;->p:Z

    .line 560
    .line 561
    :cond_24
    sget-object v0, La/eeq;->o:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 562
    .line 563
    if-eqz v0, :cond_25

    .line 564
    .line 565
    :try_start_7
    invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 566
    .line 567
    .line 568
    goto :goto_8

    .line 569
    :catch_3
    move-exception p0

    .line 570
    goto :goto_7

    .line 571
    :catch_4
    move-exception p0

    .line 572
    :goto_7
    :try_start_8
    const-string v0, "ResourcesCompat"

    .line 573
    .line 574
    const-string v2, "Failed to invoke rebase() method via reflection"

    .line 575
    .line 576
    invoke-static {v0, v2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 577
    .line 578
    .line 579
    sput-object v4, La/eeq;->o:Ljava/lang/reflect/Method;

    .line 580
    .line 581
    :cond_25
    :goto_8
    monitor-exit p1

    .line 582
    goto :goto_a

    .line 583
    :goto_9
    monitor-exit p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 584
    throw p0

    .line 585
    :catch_5
    :cond_26
    :goto_a
    return-object v1
.end method

.method public final f(La/ox30;Landroid/view/MenuItem;)Z
    .locals 6

    .line 1
    iget-object v0, p0, La/pd3;->l:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-boolean v2, p0, La/pd3;->p1:Z

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, La/ox30;->k()La/ox30;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, La/pd3;->k1:[La/od3;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    array-length v2, p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v1

    .line 25
    :goto_0
    move v3, v1

    .line 26
    :goto_1
    if-ge v3, v2, :cond_2

    .line 27
    .line 28
    aget-object v4, p0, v3

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    iget-object v5, v4, La/od3;->h:La/ox30;

    .line 33
    .line 34
    if-ne v5, p1, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v4, 0x0

    .line 41
    :goto_2
    if-eqz v4, :cond_3

    .line 42
    .line 43
    iget p0, v4, La/od3;->a:I

    .line 44
    .line 45
    invoke-interface {v0, p0, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_3
    return v1
.end method

.method public final g(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    .line 1
    iget-object p1, p0, La/pd3;->D1:La/ye3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    sget-object p1, La/mqd0;->j:[I

    .line 7
    .line 8
    iget-object v0, p0, La/pd3;->k:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/16 v2, 0x74

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 21
    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    new-instance p1, La/ye3;

    .line 26
    .line 27
    invoke-direct {p1}, La/ye3;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/pd3;->D1:La/ye3;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, La/ye3;

    .line 50
    .line 51
    iput-object p1, p0, La/pd3;->D1:La/ye3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v3, "Failed to instantiate custom view inflater "

    .line 59
    .line 60
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v2, ". Falling back to default."

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v2, "AppCompatDelegate"

    .line 76
    .line 77
    invoke-static {v2, v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 78
    .line 79
    .line 80
    new-instance p1, La/ye3;

    .line 81
    .line 82
    invoke-direct {p1}, La/ye3;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, La/pd3;->D1:La/ye3;

    .line 86
    .line 87
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    sget-object p0, La/mqd0;->z:[I

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    invoke-virtual {p3, p4, p0, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const/4 v0, 0x4

    .line 98
    invoke-virtual {p0, v0, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    const-string v3, "AppCompatViewInflater"

    .line 105
    .line 106
    const-string v4, "app:theme is now deprecated. Please move to using android:theme instead."

    .line 107
    .line 108
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    :cond_2
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 112
    .line 113
    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    instance-of p0, p3, La/tje;

    .line 117
    .line 118
    if-eqz p0, :cond_3

    .line 119
    .line 120
    move-object p0, p3

    .line 121
    check-cast p0, La/tje;

    .line 122
    .line 123
    iget p0, p0, La/tje;->a:I

    .line 124
    .line 125
    if-eq p0, v2, :cond_4

    .line 126
    .line 127
    :cond_3
    new-instance p0, La/tje;

    .line 128
    .line 129
    invoke-direct {p0, p3, v2}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    move-object p0, p3

    .line 134
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    const/4 v3, 0x3

    .line 142
    const/4 v4, 0x1

    .line 143
    const/4 v6, -0x1

    .line 144
    sparse-switch v2, :sswitch_data_0

    .line 145
    .line 146
    .line 147
    :goto_2
    move v0, v6

    .line 148
    goto/16 :goto_3

    .line 149
    .line 150
    :sswitch_0
    const-string v0, "Button"

    .line 151
    .line 152
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_5

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_5
    const/16 v0, 0xd

    .line 160
    .line 161
    goto/16 :goto_3

    .line 162
    .line 163
    :sswitch_1
    const-string v0, "EditText"

    .line 164
    .line 165
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-nez v0, :cond_6

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_6
    const/16 v0, 0xc

    .line 173
    .line 174
    goto/16 :goto_3

    .line 175
    .line 176
    :sswitch_2
    const-string v0, "CheckBox"

    .line 177
    .line 178
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_7

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_7
    const/16 v0, 0xb

    .line 186
    .line 187
    goto/16 :goto_3

    .line 188
    .line 189
    :sswitch_3
    const-string v0, "AutoCompleteTextView"

    .line 190
    .line 191
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-nez v0, :cond_8

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_8
    const/16 v0, 0xa

    .line 199
    .line 200
    goto/16 :goto_3

    .line 201
    .line 202
    :sswitch_4
    const-string v0, "ImageView"

    .line 203
    .line 204
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_9

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_9
    const/16 v0, 0x9

    .line 212
    .line 213
    goto/16 :goto_3

    .line 214
    .line 215
    :sswitch_5
    const-string v0, "ToggleButton"

    .line 216
    .line 217
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_a

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_a
    const/16 v0, 0x8

    .line 225
    .line 226
    goto/16 :goto_3

    .line 227
    .line 228
    :sswitch_6
    const-string v0, "RadioButton"

    .line 229
    .line 230
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_b

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_b
    const/4 v0, 0x7

    .line 238
    goto :goto_3

    .line 239
    :sswitch_7
    const-string v0, "Spinner"

    .line 240
    .line 241
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_c

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_c
    const/4 v0, 0x6

    .line 249
    goto :goto_3

    .line 250
    :sswitch_8
    const-string v0, "SeekBar"

    .line 251
    .line 252
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_d

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_d
    const/4 v0, 0x5

    .line 260
    goto :goto_3

    .line 261
    :sswitch_9
    const-string v2, "ImageButton"

    .line 262
    .line 263
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    if-nez v2, :cond_12

    .line 268
    .line 269
    goto :goto_2

    .line 270
    :sswitch_a
    const-string v0, "TextView"

    .line 271
    .line 272
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-nez v0, :cond_e

    .line 277
    .line 278
    goto/16 :goto_2

    .line 279
    .line 280
    :cond_e
    move v0, v3

    .line 281
    goto :goto_3

    .line 282
    :sswitch_b
    const-string v0, "MultiAutoCompleteTextView"

    .line 283
    .line 284
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-nez v0, :cond_f

    .line 289
    .line 290
    goto/16 :goto_2

    .line 291
    .line 292
    :cond_f
    const/4 v0, 0x2

    .line 293
    goto :goto_3

    .line 294
    :sswitch_c
    const-string v0, "CheckedTextView"

    .line 295
    .line 296
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-nez v0, :cond_10

    .line 301
    .line 302
    goto/16 :goto_2

    .line 303
    .line 304
    :cond_10
    move v0, v4

    .line 305
    goto :goto_3

    .line 306
    :sswitch_d
    const-string v0, "RatingBar"

    .line 307
    .line 308
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-nez v0, :cond_11

    .line 313
    .line 314
    goto/16 :goto_2

    .line 315
    .line 316
    :cond_11
    const/4 v0, 0x0

    .line 317
    :cond_12
    :goto_3
    packed-switch v0, :pswitch_data_0

    .line 318
    .line 319
    .line 320
    move-object v0, v1

    .line 321
    goto :goto_4

    .line 322
    :pswitch_0
    invoke-virtual {p1, p0, p4}, La/ye3;->b(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatButton;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    goto :goto_4

    .line 327
    :pswitch_1
    new-instance v0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 328
    .line 329
    invoke-direct {v0, p0, p4}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 330
    .line 331
    .line 332
    goto :goto_4

    .line 333
    :pswitch_2
    invoke-virtual {p1, p0, p4}, La/ye3;->c(Landroid/content/Context;Landroid/util/AttributeSet;)La/cd3;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    goto :goto_4

    .line 338
    :pswitch_3
    invoke-virtual {p1, p0, p4}, La/ye3;->a(Landroid/content/Context;Landroid/util/AttributeSet;)La/zc3;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    goto :goto_4

    .line 343
    :pswitch_4
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 344
    .line 345
    invoke-direct {v0, p0, p4}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :pswitch_5
    new-instance v0, La/we3;

    .line 350
    .line 351
    invoke-direct {v0, p0, p4}, La/we3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 352
    .line 353
    .line 354
    goto :goto_4

    .line 355
    :pswitch_6
    invoke-virtual {p1, p0, p4}, La/ye3;->d(Landroid/content/Context;Landroid/util/AttributeSet;)La/yd3;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    goto :goto_4

    .line 360
    :pswitch_7
    new-instance v0, Landroidx/appcompat/widget/b;

    .line 361
    .line 362
    invoke-direct {v0, p0, p4}, Landroidx/appcompat/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :pswitch_8
    new-instance v0, La/ae3;

    .line 367
    .line 368
    invoke-direct {v0, p0, p4}, La/ae3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 369
    .line 370
    .line 371
    goto :goto_4

    .line 372
    :pswitch_9
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 373
    .line 374
    invoke-direct {v0, p0, p4}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 375
    .line 376
    .line 377
    goto :goto_4

    .line 378
    :pswitch_a
    invoke-virtual {p1, p0, p4}, La/ye3;->e(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/appcompat/widget/AppCompatTextView;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    goto :goto_4

    .line 383
    :pswitch_b
    new-instance v0, La/wd3;

    .line 384
    .line 385
    invoke-direct {v0, p0, p4}, La/wd3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 386
    .line 387
    .line 388
    goto :goto_4

    .line 389
    :pswitch_c
    new-instance v0, La/dd3;

    .line 390
    .line 391
    invoke-direct {v0, p0, p4}, La/dd3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 392
    .line 393
    .line 394
    goto :goto_4

    .line 395
    :pswitch_d
    new-instance v0, La/zd3;

    .line 396
    .line 397
    invoke-direct {v0, p0, p4}, La/zd3;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 398
    .line 399
    .line 400
    :goto_4
    if-nez v0, :cond_17

    .line 401
    .line 402
    if-eq p3, p0, :cond_17

    .line 403
    .line 404
    iget-object p3, p1, La/ye3;->a:[Ljava/lang/Object;

    .line 405
    .line 406
    const-string v0, "view"

    .line 407
    .line 408
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_13

    .line 413
    .line 414
    const-string p2, "class"

    .line 415
    .line 416
    invoke-interface {p4, v1, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p2

    .line 420
    :cond_13
    :try_start_1
    aput-object p0, p3, v5

    .line 421
    .line 422
    aput-object p4, p3, v4

    .line 423
    .line 424
    const/16 v0, 0x2e

    .line 425
    .line 426
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-ne v6, v0, :cond_16

    .line 431
    .line 432
    move v0, v5

    .line 433
    :goto_5
    sget-object v2, La/ye3;->g:[Ljava/lang/String;

    .line 434
    .line 435
    if-ge v0, v3, :cond_15

    .line 436
    .line 437
    aget-object v2, v2, v0

    .line 438
    .line 439
    invoke-virtual {p1, p0, p2, v2}, La/ye3;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 440
    .line 441
    .line 442
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 443
    if-eqz v2, :cond_14

    .line 444
    .line 445
    aput-object v1, p3, v5

    .line 446
    .line 447
    aput-object v1, p3, v4

    .line 448
    .line 449
    move-object v1, v2

    .line 450
    goto :goto_7

    .line 451
    :cond_14
    add-int/lit8 v0, v0, 0x1

    .line 452
    .line 453
    goto :goto_5

    .line 454
    :catchall_1
    move-exception v0

    .line 455
    move-object p0, v0

    .line 456
    goto :goto_6

    .line 457
    :cond_15
    aput-object v1, p3, v5

    .line 458
    .line 459
    aput-object v1, p3, v4

    .line 460
    .line 461
    goto :goto_7

    .line 462
    :cond_16
    :try_start_2
    invoke-virtual {p1, p0, p2, v1}, La/ye3;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 463
    .line 464
    .line 465
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 466
    aput-object v1, p3, v5

    .line 467
    .line 468
    aput-object v1, p3, v4

    .line 469
    .line 470
    move-object v1, p1

    .line 471
    goto :goto_7

    .line 472
    :goto_6
    aput-object v1, p3, v5

    .line 473
    .line 474
    aput-object v1, p3, v4

    .line 475
    .line 476
    throw p0

    .line 477
    :catch_0
    aput-object v1, p3, v5

    .line 478
    .line 479
    aput-object v1, p3, v4

    .line 480
    .line 481
    :goto_7
    move-object v0, v1

    .line 482
    :cond_17
    if-eqz v0, :cond_1f

    .line 483
    .line 484
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    instance-of p2, p1, Landroid/content/ContextWrapper;

    .line 489
    .line 490
    if-eqz p2, :cond_1a

    .line 491
    .line 492
    invoke-virtual {v0}, Landroid/view/View;->hasOnClickListeners()Z

    .line 493
    .line 494
    .line 495
    move-result p2

    .line 496
    if-nez p2, :cond_18

    .line 497
    .line 498
    goto :goto_8

    .line 499
    :cond_18
    sget-object p2, La/ye3;->c:[I

    .line 500
    .line 501
    invoke-virtual {p1, p4, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object p2

    .line 509
    if-eqz p2, :cond_19

    .line 510
    .line 511
    new-instance p3, La/xe3;

    .line 512
    .line 513
    invoke-direct {p3, v0, p2}, La/xe3;-><init>(Landroid/view/View;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v0, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 517
    .line 518
    .line 519
    :cond_19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 520
    .line 521
    .line 522
    :cond_1a
    :goto_8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 523
    .line 524
    const/16 v6, 0x1c

    .line 525
    .line 526
    if-le p1, v6, :cond_1b

    .line 527
    .line 528
    goto :goto_9

    .line 529
    :cond_1b
    sget-object p1, La/ye3;->d:[I

    .line 530
    .line 531
    invoke-virtual {p0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 536
    .line 537
    .line 538
    move-result p2

    .line 539
    const-class v4, Ljava/lang/Boolean;

    .line 540
    .line 541
    if-eqz p2, :cond_1c

    .line 542
    .line 543
    invoke-virtual {p1, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 544
    .line 545
    .line 546
    move-result p2

    .line 547
    sget-object p3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 548
    .line 549
    new-instance v2, La/egu0;

    .line 550
    .line 551
    const v3, 0x7f0a0ee2

    .line 552
    .line 553
    .line 554
    const/4 v7, 0x3

    .line 555
    invoke-direct/range {v2 .. v7}, La/egu0;-><init>(ILjava/lang/Class;IIB)V

    .line 556
    .line 557
    .line 558
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 559
    .line 560
    .line 561
    move-result-object p2

    .line 562
    invoke-virtual {v2, v0, p2}, La/egu0;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    :cond_1c
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 566
    .line 567
    .line 568
    sget-object p1, La/ye3;->e:[I

    .line 569
    .line 570
    invoke-virtual {p0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 575
    .line 576
    .line 577
    move-result p2

    .line 578
    if-eqz p2, :cond_1d

    .line 579
    .line 580
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object p2

    .line 584
    invoke-static {v0, p2}, La/rgu0;->p(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 585
    .line 586
    .line 587
    :cond_1d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 588
    .line 589
    .line 590
    sget-object p1, La/ye3;->f:[I

    .line 591
    .line 592
    invoke-virtual {p0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    invoke-virtual {p0, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 597
    .line 598
    .line 599
    move-result p1

    .line 600
    if-eqz p1, :cond_1e

    .line 601
    .line 602
    invoke-virtual {p0, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 603
    .line 604
    .line 605
    move-result p1

    .line 606
    sget-object p2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 607
    .line 608
    new-instance v2, La/egu0;

    .line 609
    .line 610
    const v3, 0x7f0a0eed

    .line 611
    .line 612
    .line 613
    const/4 v7, 0x0

    .line 614
    invoke-direct/range {v2 .. v7}, La/egu0;-><init>(ILjava/lang/Class;IIB)V

    .line 615
    .line 616
    .line 617
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    invoke-virtual {v2, v0, p1}, La/egu0;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    :cond_1e
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 625
    .line 626
    .line 627
    :cond_1f
    :goto_9
    return-object v0

    .line 628
    nop

    .line 629
    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/pd3;->N()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/pd3;->l:Landroid/view/Window;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final i()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, La/pd3;->k:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()I
    .locals 0

    .line 1
    iget p0, p0, La/pd3;->r1:I

    .line 2
    .line 3
    return p0
.end method

.method public final k()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, La/pd3;->o:La/njn0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, La/pd3;->R()V

    .line 6
    .line 7
    .line 8
    new-instance v0, La/njn0;

    .line 9
    .line 10
    iget-object v1, p0, La/pd3;->n:La/qhv0;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, La/qhv0;->b()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, p0, La/pd3;->k:Landroid/content/Context;

    .line 20
    .line 21
    :goto_0
    invoke-direct {v0, v1}, La/njn0;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/pd3;->o:La/njn0;

    .line 25
    .line 26
    :cond_1
    return-object v0
.end method

.method public final l()La/qhv0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/pd3;->R()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/pd3;->n:La/qhv0;

    .line 5
    .line 6
    return-object p0
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object v0, p0, La/pd3;->k:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of p0, p0, La/pd3;

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-string p0, "AppCompatDelegate"

    .line 26
    .line 27
    const-string v0, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    .line 28
    .line 29
    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-object v0, p0, La/pd3;->n:La/qhv0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/pd3;->R()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/pd3;->n:La/qhv0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, La/pd3;->S(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, p2, p3}, La/pd3;->g(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public final p(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    iget-boolean p1, p0, La/pd3;->Z:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, La/pd3;->y:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/pd3;->R()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, La/pd3;->n:La/qhv0;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v0, p1, La/qhv0;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/high16 v1, 0x7f050000

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p1, v0}, La/qhv0;->e(Z)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-static {}, La/td3;->a()La/td3;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v0, p0, La/pd3;->k:Landroid/content/Context;

    .line 36
    .line 37
    monitor-enter p1

    .line 38
    :try_start_0
    iget-object v1, p1, La/td3;->a:La/dtf0;

    .line 39
    .line 40
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    :try_start_1
    iget-object v2, v1, La/dtf0;->b:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/u710;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0}, La/u710;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    monitor-exit p1

    .line 59
    new-instance p1, Landroid/content/res/Configuration;

    .line 60
    .line 61
    iget-object v0, p0, La/pd3;->k:Landroid/content/Context;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, La/pd3;->q1:Landroid/content/res/Configuration;

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    invoke-virtual {p0, p1, p1}, La/pd3;->E(ZZ)Z

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    :try_start_4
    throw p0

    .line 83
    :catchall_1
    move-exception p0

    .line 84
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 85
    throw p0
.end method

.method public final q(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, La/pd3;->n1:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0, p1}, La/pd3;->E(ZZ)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/pd3;->O()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/pd3;->j:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v1, v0, Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    :try_start_0
    check-cast v0, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v0, v1}, La/uvw;->D(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    :try_start_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v1
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 35
    :catch_1
    const/4 v0, 0x0

    .line 36
    :goto_0
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, La/pd3;->n:La/qhv0;

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    iput-boolean p1, p0, La/pd3;->A1:Z

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {v0, p1}, La/qhv0;->d(Z)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_1
    invoke-static {p0}, La/hd3;->b(La/hd3;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    new-instance v0, Landroid/content/res/Configuration;

    .line 52
    .line 53
    iget-object v1, p0, La/pd3;->k:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, La/pd3;->q1:Landroid/content/res/Configuration;

    .line 67
    .line 68
    iput-boolean p1, p0, La/pd3;->o1:Z

    .line 69
    .line 70
    return-void
.end method

.method public final r()V
    .locals 6

    .line 1
    sget-object v0, La/pd3;->G1:La/nuj0;

    .line 2
    .line 3
    iget v1, p0, La/pd3;->r1:I

    .line 4
    .line 5
    iget-object v2, p0, La/pd3;->j:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v3, v2, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    sget-object v4, La/hd3;->h:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v4

    .line 14
    :try_start_0
    invoke-static {p0}, La/hd3;->x(La/hd3;)V

    .line 15
    .line 16
    .line 17
    monitor-exit v4

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0

    .line 22
    :cond_0
    :goto_0
    iget-boolean v4, p0, La/pd3;->x1:Z

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    iget-object v4, p0, La/pd3;->l:Landroid/view/Window;

    .line 27
    .line 28
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v5, p0, La/pd3;->z1:La/id3;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v4, 0x1

    .line 38
    iput-boolean v4, p0, La/pd3;->p1:Z

    .line 39
    .line 40
    const/16 v4, -0x64

    .line 41
    .line 42
    if-eq v1, v4, :cond_2

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    move-object v3, v2

    .line 47
    check-cast v3, Landroid/app/Activity;

    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v2, v1}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, La/nuj0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :goto_1
    iget-object v0, p0, La/pd3;->v1:La/ld3;

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0}, La/c2;->e()V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object p0, p0, La/pd3;->w1:La/ld3;

    .line 90
    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0}, La/c2;->e()V

    .line 94
    .line 95
    .line 96
    :cond_4
    return-void
.end method

.method public final s(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/pd3;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/pd3;->R()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/pd3;->n:La/qhv0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, La/qhv0;->t:Z

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, La/pd3;->E(ZZ)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/pd3;->R()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/pd3;->n:La/qhv0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, La/qhv0;->t:Z

    .line 10
    .line 11
    iget-object p0, p0, La/qhv0;->s:La/bku0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/bku0;->a()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final y(I)Z
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/16 v1, 0x6d

    .line 4
    .line 5
    const/16 v2, 0x6c

    .line 6
    .line 7
    const-string v3, "AppCompatDelegate"

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 12
    .line 13
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move p1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v0, 0x9

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    .line 23
    .line 24
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move p1, v1

    .line 28
    :cond_1
    :goto_0
    iget-boolean v0, p0, La/pd3;->i1:Z

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    if-ne p1, v2, :cond_2

    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    iget-boolean v0, p0, La/pd3;->Z:Z

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    if-ne p1, v4, :cond_3

    .line 42
    .line 43
    iput-boolean v3, p0, La/pd3;->Z:Z

    .line 44
    .line 45
    :cond_3
    if-eq p1, v4, :cond_9

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    if-eq p1, v0, :cond_8

    .line 49
    .line 50
    const/4 v0, 0x5

    .line 51
    if-eq p1, v0, :cond_7

    .line 52
    .line 53
    const/16 v0, 0xa

    .line 54
    .line 55
    if-eq p1, v0, :cond_6

    .line 56
    .line 57
    if-eq p1, v2, :cond_5

    .line 58
    .line 59
    if-eq p1, v1, :cond_4

    .line 60
    .line 61
    iget-object p0, p0, La/pd3;->l:Landroid/view/Window;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroid/view/Window;->requestFeature(I)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :cond_4
    invoke-virtual {p0}, La/pd3;->Y()V

    .line 69
    .line 70
    .line 71
    iput-boolean v4, p0, La/pd3;->f1:Z

    .line 72
    .line 73
    return v4

    .line 74
    :cond_5
    invoke-virtual {p0}, La/pd3;->Y()V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, La/pd3;->Z:Z

    .line 78
    .line 79
    return v4

    .line 80
    :cond_6
    invoke-virtual {p0}, La/pd3;->Y()V

    .line 81
    .line 82
    .line 83
    iput-boolean v4, p0, La/pd3;->g1:Z

    .line 84
    .line 85
    return v4

    .line 86
    :cond_7
    invoke-virtual {p0}, La/pd3;->Y()V

    .line 87
    .line 88
    .line 89
    iput-boolean v4, p0, La/pd3;->Y:Z

    .line 90
    .line 91
    return v4

    .line 92
    :cond_8
    invoke-virtual {p0}, La/pd3;->Y()V

    .line 93
    .line 94
    .line 95
    iput-boolean v4, p0, La/pd3;->B:Z

    .line 96
    .line 97
    return v4

    .line 98
    :cond_9
    invoke-virtual {p0}, La/pd3;->Y()V

    .line 99
    .line 100
    .line 101
    iput-boolean v4, p0, La/pd3;->i1:Z

    .line 102
    .line 103
    return v4
.end method

.method public final z(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/pd3;->N()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/pd3;->z:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/pd3;->k:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, La/pd3;->m:La/kd3;

    .line 28
    .line 29
    iget-object p0, p0, La/pd3;->l:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, La/kd3;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
