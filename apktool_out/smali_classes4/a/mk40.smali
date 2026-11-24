.class public final synthetic La/mk40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/zog;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/zog;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mk40;->a:B

    iput-object p1, p0, La/mk40;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/mk40;->c:La/zog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/mk40;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/mk40;->c:La/zog;

    .line 4
    .line 5
    iget-object p0, p0, La/mk40;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/jyt0;

    .line 11
    .line 12
    iget-wide v2, v1, La/zog;->c:J

    .line 13
    .line 14
    iget-object v1, v1, La/zog;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v0, v2, v3, v1}, La/jyt0;-><init>(JLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    new-instance v0, La/awd0;

    .line 26
    .line 27
    iget-wide v2, v1, La/zog;->c:J

    .line 28
    .line 29
    iget-object v1, v1, La/zog;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v0, v2, v3, v1}, La/awd0;-><init>(JLjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_1
    new-instance v0, La/q110;

    .line 41
    .line 42
    iget-wide v2, v1, La/zog;->c:J

    .line 43
    .line 44
    iget-object v1, v1, La/zog;->d:Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v0, v2, v3, v1}, La/q110;-><init>(JLjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_2
    new-instance v0, La/yj40;

    .line 56
    .line 57
    iget-wide v2, v1, La/zog;->c:J

    .line 58
    .line 59
    iget-object v1, v1, La/zog;->d:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v0, v2, v3, v1}, La/yj40;-><init>(JLjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
