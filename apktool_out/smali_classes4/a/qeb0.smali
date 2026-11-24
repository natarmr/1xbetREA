.class public final La/qeb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/oeb0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/oeb0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qeb0;->a:B

    iput-object p1, p0, La/qeb0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/qeb0;->c:La/oeb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/qeb0;->a:B

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    iget-object v2, p0, La/qeb0;->c:La/oeb0;

    .line 5
    .line 6
    iget-object p0, p0, La/qeb0;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, La/xdb0;

    .line 12
    .line 13
    check-cast v2, La/jeb0;

    .line 14
    .line 15
    iget-object v2, v2, La/jeb0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :cond_0
    invoke-direct {v0, v1}, La/xdb0;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    new-instance v0, La/vdb0;

    .line 37
    .line 38
    check-cast v2, La/ieb0;

    .line 39
    .line 40
    iget-object v2, v2, La/ieb0;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_1
    invoke-direct {v0, v1}, La/vdb0;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
