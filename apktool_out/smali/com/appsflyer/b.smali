.class public final synthetic Lcom/appsflyer/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcom/appsflyer/b;->a:B

    iput-object p1, p0, Lcom/appsflyer/b;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/appsflyer/b;->a:B

    iget-object p0, p0, Lcom/appsflyer/b;->b:Lkotlin/jvm/functions/Function1;

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast p0, Lcom/appsflyer/a;

    :goto_0
    invoke-static {p0}, Lcom/appsflyer/AFLogger;->n(Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_1
    check-cast p0, Lcom/appsflyer/f;

    goto :goto_0

    :pswitch_2
    check-cast p0, Lcom/appsflyer/d;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
