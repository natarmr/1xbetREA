.class public final La/jz80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v9e0;
.implements La/iva0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jz80;->a:B

    iput-object p1, p0, La/jz80;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jz80;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jz80;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/xva0;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, p3}, La/xva0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, La/mz80;

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2, p3}, La/mz80;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(La/kyh;La/yje;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jz80;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jz80;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/xva0;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/xva0;->c(La/kyh;La/yje;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, La/mz80;

    .line 16
    .line 17
    iget-object p0, p0, La/mz80;->b:La/qpg0;

    .line 18
    .line 19
    invoke-virtual {p1, p0, p2}, La/kyh;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
