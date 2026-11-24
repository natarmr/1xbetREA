.class public final synthetic La/pho;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qho;


# direct methods
.method public synthetic constructor <init>(La/qho;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pho;->a:B

    iput-object p1, p0, La/pho;->b:La/qho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/pho;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/pho;->b:La/qho;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x3e8

    .line 13
    .line 14
    div-long/2addr v0, v2

    .line 15
    invoke-virtual {p0}, La/qho;->c()La/zfw;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v2, v2, La/zfw;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-wide v5, v3

    .line 35
    :goto_0
    invoke-virtual {p0}, La/qho;->c()La/zfw;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p0, p0, La/zfw;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    :cond_1
    cmp-long p0, v5, v0

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    if-gtz p0, :cond_2

    .line 55
    .line 56
    cmp-long p0, v0, v3

    .line 57
    .line 58
    if-gtz p0, :cond_2

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_0
    iget-object p0, p0, La/qho;->a:La/jfu;

    .line 67
    .line 68
    iget-object p0, p0, La/jfu;->a:La/pru;

    .line 69
    .line 70
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iget-object p0, p0, La/sff0;->t1:La/zfw;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
