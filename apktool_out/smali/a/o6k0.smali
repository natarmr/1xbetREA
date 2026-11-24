.class public final synthetic La/o6k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r6k0;


# direct methods
.method public synthetic constructor <init>(La/r6k0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o6k0;->a:B

    iput-object p1, p0, La/o6k0;->b:La/r6k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/o6k0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/o6k0;->b:La/r6k0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/r6k0;->h:Landroid/javax/sip/SipFactory;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/javax/sip/SipFactory;->createAddressFactory()Landroid/javax/sip/address/AddressFactory;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object p0, p0, La/r6k0;->h:Landroid/javax/sip/SipFactory;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/javax/sip/SipFactory;->createMessageFactory()Landroid/javax/sip/message/MessageFactory;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_1
    iget-object p0, p0, La/r6k0;->h:Landroid/javax/sip/SipFactory;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/javax/sip/SipFactory;->createHeaderFactory()Landroid/javax/sip/header/HeaderFactory;

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
