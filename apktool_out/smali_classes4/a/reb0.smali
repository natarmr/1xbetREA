.class public final La/reb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/oeb0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/oeb0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/reb0;->a:B

    iput-object p1, p0, La/reb0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/reb0;->c:La/oeb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/reb0;->a:B

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    iget-object v2, p0, La/reb0;->c:La/oeb0;

    .line 5
    .line 6
    iget-object p0, p0, La/reb0;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/wim;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, La/ydb0;

    .line 19
    .line 20
    iget p1, p1, La/wim;->a:I

    .line 21
    .line 22
    int-to-long v3, p1

    .line 23
    check-cast v2, La/jeb0;

    .line 24
    .line 25
    iget-object p1, v2, La/jeb0;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    :cond_0
    invoke-direct {v0, p2, v1, v3, v4}, La/ydb0;-><init>(Ljava/lang/String;IJ)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    check-cast p1, La/wim;

    .line 47
    .line 48
    check-cast p2, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v0, La/wdb0;

    .line 54
    .line 55
    iget p1, p1, La/wim;->a:I

    .line 56
    .line 57
    int-to-long v3, p1

    .line 58
    check-cast v2, La/ieb0;

    .line 59
    .line 60
    iget-object p1, v2, La/ieb0;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    :cond_1
    invoke-direct {v0, p2, v1, v3, v4}, La/wdb0;-><init>(Ljava/lang/String;IJ)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
