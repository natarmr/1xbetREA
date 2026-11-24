.class public final La/a9g;
.super La/nju0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/y6e;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/a9g;->a:B

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La/a9g;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a9g;->a:B

    iput-object p1, p0, La/a9g;->b:Ljava/lang/Object;

    iput-object p2, p0, La/a9g;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(I)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(I)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 6

    .line 1
    iget-byte v0, p0, La/a9g;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    iget-object v0, p0, La/a9g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/b9g;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    :try_start_0
    iget-object p1, v0, La/b9g;->P1:La/nl9;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/a9g;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/c9g;

    .line 20
    .line 21
    iget-object p0, p0, La/c9g;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iget-object p1, p1, La/zx5;->n:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 36
    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    iget-object p1, v0, La/b9g;->O1:La/kiu0;

    .line 40
    .line 41
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, La/g9g;

    .line 46
    .line 47
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p1, La/g9g;->i:La/mne;

    .line 52
    .line 53
    iget-object v3, v1, La/mne;->a:La/rwj;

    .line 54
    .line 55
    new-instance v1, La/d9g;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-direct {v1, p1, v2}, La/d9g;-><init>(La/g9g;B)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/b1f;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    const/16 v5, 0x9

    .line 65
    .line 66
    invoke-direct {v4, p0, p1, v2, v5}, La/b1f;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    const/16 v5, 0xa

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catch_0
    move-exception v0

    .line 77
    move-object p0, v0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 79
    .line 80
    .line 81
    :cond_0
    :goto_0
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(IFI)V
    .locals 6

    .line 1
    iget-byte p3, p0, La/a9g;->a:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p3, p0, La/a9g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 10
    .line 11
    iget-object v0, p0, La/a9g;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/oju0;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    neg-float p2, p2

    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    invoke-virtual {p3}, Landroidx/recyclerview/widget/b;->I()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-ge v0, v1, :cond_5

    .line 25
    .line 26
    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    invoke-static {v1}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v2, p1

    .line 37
    int-to-float v2, v2

    .line 38
    add-float/2addr v2, p2

    .line 39
    iget-object v3, p0, La/a9g;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, La/oju0;

    .line 42
    .line 43
    check-cast v3, La/x860;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    instance-of v4, v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    instance-of v4, v5, Landroidx/viewpager2/widget/ViewPager2;

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    check-cast v5, Landroidx/viewpager2/widget/ViewPager2;

    .line 65
    .line 66
    iget v3, v3, La/x860;->a:I

    .line 67
    .line 68
    int-to-float v3, v3

    .line 69
    mul-float/2addr v3, v2

    .line 70
    invoke-virtual {v5}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    invoke-virtual {v5}, Landroidx/viewpager2/widget/ViewPager2;->b()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_1

    .line 81
    .line 82
    neg-float v3, v3

    .line 83
    :cond_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setTranslationX(F)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 88
    .line 89
    .line 90
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    const-string p0, "Expected the page view to be managed by a ViewPager2 instance."

    .line 94
    .line 95
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 100
    .line 101
    invoke-virtual {p3}, Landroidx/recyclerview/widget/b;->I()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    const-string p1, "/"

    .line 106
    .line 107
    const-string p2, " while transforming pages"

    .line 108
    .line 109
    const-string p3, "LayoutManager returned a null child at pos "

    .line 110
    .line 111
    invoke-static {p3, v0, p1, p2, p0}, La/ohs0;->m(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    :goto_2
    return-void

    .line 119
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c(I)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/a9g;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, La/a9g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/gym0;

    .line 10
    .line 11
    iput p1, v0, La/gym0;->h:I

    .line 12
    .line 13
    iget-object v0, v0, La/gym0;->e:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/swm0;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, La/swm0;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    :goto_0
    iget-object p0, p0, La/a9g;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, La/nfj0;

    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, v0, p1}, La/nfj0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :pswitch_1
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
