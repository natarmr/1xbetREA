.class public final synthetic La/za10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ab10;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bb10;


# direct methods
.method public synthetic constructor <init>(La/bb10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/za10;->a:B

    iput-object p1, p0, La/za10;->b:La/bb10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/za10;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/za10;->b:La/bb10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/bb10;->l()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p0}, La/bb10;->n()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
