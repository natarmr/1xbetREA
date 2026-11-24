.class public final synthetic La/e160;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/a4x;

.field public final synthetic d:Z

.field public final synthetic e:La/bdz;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a4x;La/bdz;ZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p6, 0x2

    iput-byte p6, p0, La/e160;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/e160;->b:La/mm40;

    iput-object p2, p0, La/e160;->c:La/a4x;

    iput-object p3, p0, La/e160;->e:La/bdz;

    iput-boolean p4, p0, La/e160;->d:Z

    iput-object p5, p0, La/e160;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/a4x;ZLa/bdz;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    const/4 p6, 0x1

    iput-byte p6, p0, La/e160;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/e160;->b:La/mm40;

    iput-object p2, p0, La/e160;->c:La/a4x;

    iput-boolean p3, p0, La/e160;->d:Z

    iput-object p4, p0, La/e160;->e:La/bdz;

    iput-object p5, p0, La/e160;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/bdz;La/a4x;ZLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 3
    iput-byte p7, p0, La/e160;->a:B

    iput-object p1, p0, La/e160;->b:La/mm40;

    iput-object p2, p0, La/e160;->e:La/bdz;

    iput-object p3, p0, La/e160;->c:La/a4x;

    iput-boolean p4, p0, La/e160;->d:Z

    iput-object p5, p0, La/e160;->f:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/e160;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v2, p1

    .line 7
    check-cast v2, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-static {p1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v3, p0, La/e160;->c:La/a4x;

    .line 20
    .line 21
    iget-object v4, p0, La/e160;->e:La/bdz;

    .line 22
    .line 23
    iget-object v5, p0, La/e160;->b:La/mm40;

    .line 24
    .line 25
    iget-object v6, p0, La/e160;->f:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    iget-boolean v7, p0, La/e160;->d:Z

    .line 28
    .line 29
    invoke-static/range {v1 .. v7}, La/nia0;->q(ILa/fet;La/a4x;La/bdz;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    move-object v1, p1

    .line 36
    check-cast v1, La/fet;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-static {p1}, La/x8x;->L(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/e160;->c:La/a4x;

    .line 49
    .line 50
    iget-object v3, p0, La/e160;->e:La/bdz;

    .line 51
    .line 52
    iget-object v4, p0, La/e160;->b:La/mm40;

    .line 53
    .line 54
    iget-object v5, p0, La/e160;->f:Lkotlin/jvm/functions/Function1;

    .line 55
    .line 56
    iget-boolean v6, p0, La/e160;->d:Z

    .line 57
    .line 58
    invoke-static/range {v0 .. v6}, La/nia0;->F(ILa/fet;La/a4x;La/bdz;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_1
    move-object v1, p1

    .line 65
    check-cast v1, La/fet;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    invoke-static {p1}, La/x8x;->L(I)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v2, p0, La/e160;->c:La/a4x;

    .line 78
    .line 79
    iget-object v3, p0, La/e160;->e:La/bdz;

    .line 80
    .line 81
    iget-object v4, p0, La/e160;->b:La/mm40;

    .line 82
    .line 83
    iget-object v5, p0, La/e160;->f:Lkotlin/jvm/functions/Function1;

    .line 84
    .line 85
    iget-boolean v6, p0, La/e160;->d:Z

    .line 86
    .line 87
    invoke-static/range {v0 .. v6}, La/nia0;->C(ILa/fet;La/a4x;La/bdz;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_2
    move-object v1, p1

    .line 94
    check-cast v1, La/fet;

    .line 95
    .line 96
    check-cast p2, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/4 p1, 0x1

    .line 102
    invoke-static {p1}, La/x8x;->L(I)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-object v2, p0, La/e160;->c:La/a4x;

    .line 107
    .line 108
    iget-object v3, p0, La/e160;->e:La/bdz;

    .line 109
    .line 110
    iget-object v4, p0, La/e160;->b:La/mm40;

    .line 111
    .line 112
    iget-object v5, p0, La/e160;->f:Lkotlin/jvm/functions/Function1;

    .line 113
    .line 114
    iget-boolean v6, p0, La/e160;->d:Z

    .line 115
    .line 116
    invoke-static/range {v0 .. v6}, La/nia0;->y(ILa/fet;La/a4x;La/bdz;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
