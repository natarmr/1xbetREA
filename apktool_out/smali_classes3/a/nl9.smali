.class public final La/nl9;
.super La/zx5;
.source "SourceFile"


# instance fields
.field public final o:La/yag;

.field public final p:Z

.field public final q:La/e8g;


# direct methods
.method public constructor <init>(La/yag;ZLandroidx/fragment/app/e;La/glz;La/iun;La/e8g;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p3, p4, p5}, La/zx5;-><init>(Landroidx/fragment/app/e;La/glz;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/nl9;->o:La/yag;

    .line 14
    .line 15
    iput-boolean p2, p0, La/nl9;->p:Z

    .line 16
    .line 17
    iput-object p6, p0, La/nl9;->q:La/e8g;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final B(I)Landroidx/fragment/app/Fragment;
    .locals 7

    .line 1
    iget-object v0, p0, La/zx5;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    sget-object v1, La/yag;->d:La/yag;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    iget-boolean v4, p0, La/nl9;->p:Z

    .line 10
    .line 11
    iget-object v5, p0, La/nl9;->o:La/yag;

    .line 12
    .line 13
    if-ne v5, v1, :cond_0

    .line 14
    .line 15
    sget-object p0, La/y7g;->Q1:La/std;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance p0, La/y7g;

    .line 30
    .line 31
    invoke-direct {p0}, La/y7g;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v0, La/y7g;->R1:[La/iiy;

    .line 35
    .line 36
    aget-object v1, v0, v3

    .line 37
    .line 38
    iget-object v3, p0, La/y7g;->O1:La/khf0;

    .line 39
    .line 40
    invoke-virtual {v3, p0, v1, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 41
    .line 42
    .line 43
    aget-object p1, v0, v2

    .line 44
    .line 45
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, La/y7g;->P1:La/yzn0;

    .line 50
    .line 51
    invoke-virtual {v1, p0, p1, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_0
    sget-object v1, La/l6g;->Q1:La/kwd;

    .line 56
    .line 57
    new-instance v6, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 64
    .line 65
    invoke-direct {v6, v5, p1}, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;-><init>(La/yag;Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance p1, La/l6g;

    .line 72
    .line 73
    invoke-direct {p1}, La/l6g;-><init>()V

    .line 74
    .line 75
    .line 76
    sget-object v0, La/l6g;->R1:[La/iiy;

    .line 77
    .line 78
    aget-object v1, v0, v3

    .line 79
    .line 80
    iget-object v3, p1, La/l6g;->O1:La/khf0;

    .line 81
    .line 82
    invoke-virtual {v3, p1, v1, v6}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 83
    .line 84
    .line 85
    aget-object v0, v0, v2

    .line 86
    .line 87
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v2, p1, La/l6g;->P1:La/yzn0;

    .line 92
    .line 93
    invoke-virtual {v2, p1, v0, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 97
    .line 98
    new-instance v1, La/tvj;

    .line 99
    .line 100
    new-instance v2, La/m87;

    .line 101
    .line 102
    const/16 v3, 0x19

    .line 103
    .line 104
    invoke-direct {v2, p0, v3}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    const/16 p0, 0x3b

    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    invoke-direct {v1, v2, v3, v3, p0}, La/tvj;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, La/glz;->a(La/blz;)V

    .line 114
    .line 115
    .line 116
    return-object p1
.end method
