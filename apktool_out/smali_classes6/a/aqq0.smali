.class public final synthetic La/aqq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/awr0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/awr0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/aqq0;->a:B

    iput-object p1, p0, La/aqq0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/aqq0;->c:La/awr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/aqq0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/aqq0;->c:La/awr0;

    .line 4
    .line 5
    iget-object p0, p0, La/aqq0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget v0, v1, La/awr0;->a:I

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-static {}, La/dyb;->u0()V

    .line 20
    .line 21
    .line 22
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    new-instance v0, La/aqq0;

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    invoke-direct {v0, p0, v1, v2}, La/aqq0;-><init>(Lkotlin/jvm/functions/Function1;La/awr0;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, La/dyb;->Q(Lkotlin/jvm/functions/Function0;)Z

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    new-instance v0, La/aqq0;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v0, p0, v1, v2}, La/aqq0;-><init>(Lkotlin/jvm/functions/Function1;La/awr0;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, La/dyb;->Q(Lkotlin/jvm/functions/Function0;)Z

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_2
    iget v0, v1, La/awr0;->a:I

    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    invoke-static {}, La/dyb;->u0()V

    .line 59
    .line 60
    .line 61
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
