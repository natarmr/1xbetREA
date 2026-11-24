.class public final synthetic La/g8f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j8f;

.field public final synthetic c:La/sd60;


# direct methods
.method public synthetic constructor <init>(La/j8f;La/sd60;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g8f;->a:B

    iput-object p1, p0, La/g8f;->b:La/j8f;

    iput-object p2, p0, La/g8f;->c:La/sd60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/g8f;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/g8f;->c:La/sd60;

    .line 4
    .line 5
    iget-object p0, p0, La/g8f;->b:La/j8f;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, La/j8f;->a(La/sd60;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, v1}, La/j8f;->a(La/sd60;)V

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
