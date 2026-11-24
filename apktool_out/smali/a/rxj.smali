.class public final synthetic La/rxj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pmn0;


# direct methods
.method public synthetic constructor <init>(La/pmn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rxj;->a:B

    iput-object p1, p0, La/rxj;->b:La/pmn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/rxj;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rxj;->b:La/pmn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/pmn0;->f:La/wu9;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, v0}, La/wu9;->cancel(Z)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-virtual {p0}, La/pmn0;->c()Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
