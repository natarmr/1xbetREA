.class public final synthetic La/b0y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/b0y;->a:B

    iput-object p1, p0, La/b0y;->b:La/mm40;

    iput-object p2, p0, La/b0y;->c:Ljava/lang/String;

    iput-boolean p3, p0, La/b0y;->d:Z

    iput-object p4, p0, La/b0y;->e:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    const/4 p5, 0x0

    iput-byte p5, p0, La/b0y;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b0y;->b:La/mm40;

    iput-boolean p2, p0, La/b0y;->d:Z

    iput-object p3, p0, La/b0y;->c:Ljava/lang/String;

    iput-object p4, p0, La/b0y;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/b0y;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v3, p1

    .line 8
    check-cast v3, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v4, p0, La/b0y;->b:La/mm40;

    .line 20
    .line 21
    iget-object v5, p0, La/b0y;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v6, p0, La/b0y;->e:Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    iget-boolean v7, p0, La/b0y;->d:Z

    .line 26
    .line 27
    invoke-static/range {v2 .. v7}, La/bww;->p(ILa/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, La/fet;

    .line 34
    .line 35
    check-cast p2, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, La/x8x;->L(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/b0y;->b:La/mm40;

    .line 45
    .line 46
    iget-object v3, p0, La/b0y;->c:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v4, p0, La/b0y;->e:Lkotlin/jvm/functions/Function0;

    .line 49
    .line 50
    iget-boolean v5, p0, La/b0y;->d:Z

    .line 51
    .line 52
    move-object v1, p1

    .line 53
    invoke-static/range {v0 .. v5}, La/xvw;->m(ILa/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    check-cast p1, La/fet;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, La/x8x;->L(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/b0y;->b:La/mm40;

    .line 71
    .line 72
    iget-object v3, p0, La/b0y;->c:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v4, p0, La/b0y;->e:Lkotlin/jvm/functions/Function0;

    .line 75
    .line 76
    iget-boolean v5, p0, La/b0y;->d:Z

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    invoke-static/range {v0 .. v5}, La/vdx;->r(ILa/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_2
    check-cast p1, La/fet;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v1}, La/x8x;->L(I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object v2, p0, La/b0y;->b:La/mm40;

    .line 97
    .line 98
    iget-object v3, p0, La/b0y;->c:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v4, p0, La/b0y;->e:Lkotlin/jvm/functions/Function0;

    .line 101
    .line 102
    iget-boolean v5, p0, La/b0y;->d:Z

    .line 103
    .line 104
    move-object v1, p1

    .line 105
    invoke-static/range {v0 .. v5}, La/i4w0;->E(ILa/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_3
    check-cast p1, La/fet;

    .line 112
    .line 113
    check-cast p2, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v1}, La/x8x;->L(I)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    iget-object v2, p0, La/b0y;->b:La/mm40;

    .line 123
    .line 124
    iget-object v3, p0, La/b0y;->c:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v4, p0, La/b0y;->e:Lkotlin/jvm/functions/Function0;

    .line 127
    .line 128
    iget-boolean v5, p0, La/b0y;->d:Z

    .line 129
    .line 130
    move-object v1, p1

    .line 131
    invoke-static/range {v0 .. v5}, La/m8x;->B(ILa/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V

    .line 132
    .line 133
    .line 134
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
