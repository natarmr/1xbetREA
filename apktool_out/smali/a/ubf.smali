.class public final La/ubf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/o5d0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ubf;->a:B

    iput-object p1, p0, La/ubf;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ubf;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ubf;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    check-cast p0, La/ubf;

    .line 10
    .line 11
    iget-object p0, p0, La/ubf;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroid/content/Context;

    .line 14
    .line 15
    new-instance v0, La/uxs0;

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/uxs0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/bzs0;

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    invoke-direct {v1, v2}, La/bzs0;-><init>(B)V

    .line 26
    .line 27
    .line 28
    new-instance v2, La/cu;

    .line 29
    .line 30
    const/16 v3, 0xd

    .line 31
    .line 32
    invoke-direct {v2, p0, v0, v1, v3}, La/cu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
