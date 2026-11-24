.class public final synthetic La/h0s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(JJJLa/ms2;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/h0s;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p7, p0, La/h0s;->d:Ljava/lang/Object;

    iput-wide p1, p0, La/h0s;->b:J

    iput-wide p3, p0, La/h0s;->c:J

    iput-wide p5, p0, La/h0s;->f:J

    iput-object p8, p0, La/h0s;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(JJLa/l0s;La/j1g;JB)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/h0s;->a:B

    packed-switch p9, :pswitch_data_0

    :pswitch_0
    sget-object p9, La/l1g;->b:La/l1g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/h0s;->b:J

    iput-wide p3, p0, La/h0s;->c:J

    iput-object p5, p0, La/h0s;->d:Ljava/lang/Object;

    iput-object p6, p0, La/h0s;->e:Ljava/lang/Object;

    iput-wide p7, p0, La/h0s;->f:J

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/h0s;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/h0s;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-wide v2, p0, La/h0s;->f:J

    .line 6
    .line 7
    iget-wide v4, p0, La/h0s;->c:J

    .line 8
    .line 9
    iget-wide v6, p0, La/h0s;->b:J

    .line 10
    .line 11
    iget-object p0, p0, La/h0s;->d:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, La/ms2;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    check-cast p1, La/n1g;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0}, La/n1g;->a(La/ms2;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, La/j1g;->c:La/j1g;

    .line 29
    .line 30
    iput-object p0, p1, La/n1g;->d:La/j1g;

    .line 31
    .line 32
    sget-object p0, La/l1g;->c:La/l1g;

    .line 33
    .line 34
    iput-object p0, p1, La/n1g;->f:La/l1g;

    .line 35
    .line 36
    const-wide/16 v8, 0x28

    .line 37
    .line 38
    cmp-long p0, v6, v8

    .line 39
    .line 40
    if-nez p0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-wide v4, v6

    .line 44
    :goto_0
    iput-wide v4, p1, La/n1g;->c:J

    .line 45
    .line 46
    iput-wide v2, p1, La/n1g;->b:J

    .line 47
    .line 48
    invoke-virtual {p1, v1}, La/n1g;->b(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_0
    check-cast p0, La/l0s;

    .line 55
    .line 56
    check-cast v1, La/j1g;

    .line 57
    .line 58
    sget-object v0, La/l1g;->c:La/l1g;

    .line 59
    .line 60
    check-cast p1, La/n1g;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {p1, v6}, La/n1g;->b(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput-wide v4, p1, La/n1g;->c:J

    .line 73
    .line 74
    iget-object p0, p0, La/l0s;->z:La/ms2;

    .line 75
    .line 76
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 77
    .line 78
    iput-object v1, p1, La/n1g;->d:La/j1g;

    .line 79
    .line 80
    iput-object v0, p1, La/n1g;->f:La/l1g;

    .line 81
    .line 82
    iput-wide v2, p1, La/n1g;->b:J

    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1
    check-cast p0, La/l0s;

    .line 88
    .line 89
    check-cast v1, La/j1g;

    .line 90
    .line 91
    sget-object v0, La/l1g;->c:La/l1g;

    .line 92
    .line 93
    check-cast p1, La/n1g;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {p1, v6}, La/n1g;->b(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iput-wide v4, p1, La/n1g;->c:J

    .line 106
    .line 107
    iget-object p0, p0, La/l0s;->z:La/ms2;

    .line 108
    .line 109
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 110
    .line 111
    iput-object v1, p1, La/n1g;->d:La/j1g;

    .line 112
    .line 113
    iput-object v0, p1, La/n1g;->f:La/l1g;

    .line 114
    .line 115
    iput-wide v2, p1, La/n1g;->b:J

    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
