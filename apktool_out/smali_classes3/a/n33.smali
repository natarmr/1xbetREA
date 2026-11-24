.class public final synthetic La/n33;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/a;La/fzg0;ILandroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/n33;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n33;->c:Ljava/lang/Object;

    iput-object p2, p0, La/n33;->d:Ljava/lang/Object;

    iput-object p3, p0, La/n33;->e:Ljava/lang/Object;

    iput-object p4, p0, La/n33;->f:Ljava/lang/Object;

    iput p5, p0, La/n33;->b:I

    iput-object p6, p0, La/n33;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;La/p6g;ILjava/util/ArrayList;La/x7g;La/x7g;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/n33;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n33;->c:Ljava/lang/Object;

    iput-object p2, p0, La/n33;->d:Ljava/lang/Object;

    iput p3, p0, La/n33;->b:I

    iput-object p4, p0, La/n33;->e:Ljava/lang/Object;

    iput-object p5, p0, La/n33;->f:Ljava/lang/Object;

    iput-object p6, p0, La/n33;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/n33;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/n33;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/n33;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/n33;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/n33;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, La/n33;->c:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v5, Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;

    .line 17
    .line 18
    check-cast v4, La/p6g;

    .line 19
    .line 20
    check-cast v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    check-cast v2, La/x7g;

    .line 23
    .line 24
    check-cast v1, La/x7g;

    .line 25
    .line 26
    sget v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;->b:I

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v3, 0x1

    .line 33
    sub-int/2addr v0, v3

    .line 34
    iget p0, p0, La/n33;->b:I

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    if-ne p0, v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v3, v6

    .line 41
    :goto_0
    iget-object v0, v5, Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, La/ibg;

    .line 48
    .line 49
    if-nez p0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0, v5}, La/ibg;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/ibg;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-object v7, p0, La/ibg;->a:Landroid/widget/LinearLayout;

    .line 64
    .line 65
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object v0, p0, La/ibg;->b:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 72
    .line 73
    sget-object v5, La/yag;->d:La/yag;

    .line 74
    .line 75
    iget-object v4, v4, La/p6g;->b:La/t9g;

    .line 76
    .line 77
    invoke-virtual {v0, v5, v4, v2, v1}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->f(La/yag;La/t9g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, La/ibg;->d:Landroid/view/View;

    .line 81
    .line 82
    if-nez v3, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const/16 v6, 0x8

    .line 86
    .line 87
    :goto_1
    invoke-virtual {p0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_0
    check-cast v5, Landroid/content/Context;

    .line 94
    .line 95
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 96
    .line 97
    check-cast v3, Landroidx/compose/runtime/a;

    .line 98
    .line 99
    check-cast v2, La/fzg0;

    .line 100
    .line 101
    check-cast v1, Landroid/view/View;

    .line 102
    .line 103
    new-instance v0, La/bhu0;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-object v6, v1

    .line 109
    check-cast v6, La/cg80;

    .line 110
    .line 111
    iget p0, p0, La/n33;->b:I

    .line 112
    .line 113
    move-object v1, v4

    .line 114
    move-object v4, v2

    .line 115
    move-object v2, v1

    .line 116
    move-object v1, v5

    .line 117
    move v5, p0

    .line 118
    invoke-direct/range {v0 .. v6}, La/bhu0;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/a;La/fzg0;ILa/cg80;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, La/k33;->getLayoutNode()La/e7z;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
