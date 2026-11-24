.class public final synthetic La/kdg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p8f;

.field public final synthetic c:La/x45;


# direct methods
.method public synthetic constructor <init>(La/p8f;La/x45;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kdg0;->a:B

    iput-object p1, p0, La/kdg0;->b:La/p8f;

    iput-object p2, p0, La/kdg0;->c:La/x45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/kdg0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/kdg0;->c:La/x45;

    .line 4
    .line 5
    iget-object p0, p0, La/kdg0;->b:La/p8f;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, La/p8f;->a(La/x45;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, v1}, La/p8f;->a(La/x45;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
