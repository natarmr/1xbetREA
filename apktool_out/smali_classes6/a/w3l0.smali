.class public final La/w3l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ngk0;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/ngk0;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w3l0;->a:B

    iput-object p1, p0, La/w3l0;->b:La/ngk0;

    iput-object p2, p0, La/w3l0;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/w3l0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/w3l0;->b:La/ngk0;

    .line 7
    .line 8
    iget-object p0, p0, La/w3l0;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, La/ngk0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, La/w3l0;->b:La/ngk0;

    .line 15
    .line 16
    iget-object p0, p0, La/w3l0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, La/ngk0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, La/w3l0;->b:La/ngk0;

    .line 23
    .line 24
    iget-object p0, p0, La/w3l0;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/ngk0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    iget-object v0, p0, La/w3l0;->b:La/ngk0;

    .line 31
    .line 32
    iget-object p0, p0, La/w3l0;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, La/ngk0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
