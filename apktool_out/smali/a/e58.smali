.class public final synthetic La/e58;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l58;


# direct methods
.method public synthetic constructor <init>(La/l58;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/e58;->a:B

    iput-object p1, p0, La/e58;->b:La/l58;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/l58;ILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    iput-byte p2, p0, La/e58;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/e58;->b:La/l58;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/e58;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/e58;->b:La/l58;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, La/t58;->y:Z

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 15
    .line 16
    iget-object v0, p0, La/t58;->c:La/nnw0;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, La/s58;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, La/t58;->c:La/nnw0;

    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_1
    iget-object p0, p0, La/l58;->H1:La/t58;

    .line 29
    .line 30
    iget-object v0, p0, La/t58;->c:La/nnw0;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    new-instance v0, La/s58;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, La/t58;->c:La/nnw0;

    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
