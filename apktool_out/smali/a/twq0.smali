.class public final synthetic La/twq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uwq0;


# direct methods
.method public synthetic constructor <init>(La/uwq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/twq0;->a:B

    iput-object p1, p0, La/twq0;->b:La/uwq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/twq0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/twq0;->b:La/uwq0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/uwq0;->a()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, La/uwq0;->c(Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
