.class public final synthetic La/pw30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xw30;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(La/xw30;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/pw30;->a:B

    iput-object p1, p0, La/pw30;->b:La/xw30;

    iput-wide p2, p0, La/pw30;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/pw30;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/pw30;->b:La/xw30;

    .line 4
    .line 5
    check-cast p1, La/k0w0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;

    .line 14
    .line 15
    new-instance v2, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 16
    .line 17
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, La/lx30;

    .line 22
    .line 23
    iget-object v3, v3, La/lx30;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/lx30;

    .line 30
    .line 31
    iget-object v8, v1, La/lx30;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    iget-wide v5, p0, La/pw30;->c:J

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    invoke-direct/range {v2 .. v8}, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;-><init>(Ljava/lang/String;ZJZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v2}, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;-><init>(Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v0, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;

    .line 53
    .line 54
    new-instance v2, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 55
    .line 56
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, La/lx30;

    .line 61
    .line 62
    iget-object v3, v3, La/lx30;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/lx30;

    .line 69
    .line 70
    iget-object v8, v1, La/lx30;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 71
    .line 72
    const/4 v4, 0x1

    .line 73
    iget-wide v5, p0, La/pw30;->c:J

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    invoke-direct/range {v2 .. v8}, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;-><init>(Ljava/lang/String;ZJZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v2}, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;-><init>(Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
