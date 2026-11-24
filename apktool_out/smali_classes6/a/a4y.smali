.class public final synthetic La/a4y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d4y;


# direct methods
.method public synthetic constructor <init>(La/d4y;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a4y;->a:B

    iput-object p1, p0, La/a4y;->b:La/d4y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/a4y;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/a4y;->b:La/d4y;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, La/u3y;

    .line 15
    .line 16
    invoke-direct {p1, p2, v2}, La/u3y;-><init>(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    sget p2, La/d4y;->F:I

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance p1, La/u3y;

    .line 38
    .line 39
    invoke-direct {p1, p2, v2}, La/u3y;-><init>(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/ql5;

    .line 49
    .line 50
    check-cast p2, La/ql5;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-wide v3, p1, La/ql5;->a:J

    .line 59
    .line 60
    iget-wide p1, p2, La/ql5;->a:J

    .line 61
    .line 62
    cmp-long p1, v3, p1

    .line 63
    .line 64
    if-eqz p1, :cond_0

    .line 65
    .line 66
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, La/x3y;

    .line 71
    .line 72
    iget-object p0, p0, La/x3y;->b:La/tm5;

    .line 73
    .line 74
    iget-wide p0, p0, La/tm5;->a:J

    .line 75
    .line 76
    const-wide/16 v3, 0x0

    .line 77
    .line 78
    cmp-long p0, p0, v3

    .line 79
    .line 80
    if-nez p0, :cond_1

    .line 81
    .line 82
    :cond_0
    move v1, v2

    .line 83
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 89
    .line 90
    check-cast p2, Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    instance-of v0, p1, La/zhi0;

    .line 99
    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    check-cast p1, La/zhi0;

    .line 103
    .line 104
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 105
    .line 106
    sget-object v0, La/i2o;->q:La/i2o;

    .line 107
    .line 108
    if-ne p1, v0, :cond_2

    .line 109
    .line 110
    new-instance p1, La/s3y;

    .line 111
    .line 112
    invoke-direct {p1, p2}, La/s3y;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    new-instance p1, La/u3y;

    .line 120
    .line 121
    invoke-direct {p1, p2, v1}, La/u3y;-><init>(Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
