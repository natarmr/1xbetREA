.class public final synthetic La/v5h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:J

.field public final synthetic d:La/b7h;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;JLa/b7h;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/v5h;->a:B

    iput-object p1, p0, La/v5h;->b:Lkotlin/jvm/functions/Function1;

    iput-wide p2, p0, La/v5h;->c:J

    iput-object p4, p0, La/v5h;->d:La/b7h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/v5h;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/v5h;->d:La/b7h;

    .line 4
    .line 5
    iget-object v2, p0, La/v5h;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/k6h;

    .line 11
    .line 12
    iget-wide v8, v1, La/b7h;->a:J

    .line 13
    .line 14
    iget-object v5, v1, La/b7h;->b:Ljava/lang/String;

    .line 15
    .line 16
    iget-boolean v0, v1, La/b7h;->d:Z

    .line 17
    .line 18
    xor-int/lit8 v4, v0, 0x1

    .line 19
    .line 20
    iget-wide v6, p0, La/v5h;->c:J

    .line 21
    .line 22
    invoke-direct/range {v3 .. v9}, La/k6h;-><init>(ZLjava/lang/String;JJ)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance v3, La/i6h;

    .line 32
    .line 33
    iget-wide v7, v1, La/b7h;->a:J

    .line 34
    .line 35
    iget-boolean v0, v1, La/b7h;->c:Z

    .line 36
    .line 37
    xor-int/lit8 v6, v0, 0x1

    .line 38
    .line 39
    iget-wide v4, p0, La/v5h;->c:J

    .line 40
    .line 41
    invoke-direct/range {v3 .. v8}, La/i6h;-><init>(JZJ)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    new-instance v0, La/v5h;

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    iget-object v1, p0, La/v5h;->b:Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    iget-wide v2, p0, La/v5h;->c:J

    .line 56
    .line 57
    iget-object v4, p0, La/v5h;->d:La/b7h;

    .line 58
    .line 59
    invoke-direct/range {v0 .. v5}, La/v5h;-><init>(Lkotlin/jvm/functions/Function1;JLa/b7h;B)V

    .line 60
    .line 61
    .line 62
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 63
    .line 64
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, La/bjj;->a()V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_2
    new-instance v0, La/v5h;

    .line 75
    .line 76
    const/4 v5, 0x2

    .line 77
    iget-object v1, p0, La/v5h;->b:Lkotlin/jvm/functions/Function1;

    .line 78
    .line 79
    iget-wide v2, p0, La/v5h;->c:J

    .line 80
    .line 81
    iget-object v4, p0, La/v5h;->d:La/b7h;

    .line 82
    .line 83
    invoke-direct/range {v0 .. v5}, La/v5h;-><init>(Lkotlin/jvm/functions/Function1;JLa/b7h;B)V

    .line 84
    .line 85
    .line 86
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 87
    .line 88
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, La/bjj;->a()V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
