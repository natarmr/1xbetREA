.class public final synthetic La/v41;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z41;


# direct methods
.method public synthetic constructor <init>(La/z41;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v41;->a:B

    iput-object p1, p0, La/v41;->b:La/z41;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/v41;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/v41;->b:La/z41;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "layoutConfigurationAggregatorUnAuth.json"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/z41;->a(Ljava/lang/String;)La/f51;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    const-string v0, "layoutConfigurationAggregatorAuth.json"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/z41;->a(Ljava/lang/String;)La/f51;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_1
    const-string v0, "layoutConfigurationVirtual.json"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/z41;->a(Ljava/lang/String;)La/f51;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
