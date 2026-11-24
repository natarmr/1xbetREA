.class public final synthetic La/as4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ts4;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/ts4;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/as4;->a:B

    iput-object p1, p0, La/as4;->b:La/ts4;

    iput-object p2, p0, La/as4;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/as4;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/as4;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/as4;->b:La/ts4;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/String;

    .line 10
    .line 11
    check-cast p3, Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1, p2, p3}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, La/ts4;->k:La/do20;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v1, p2, p3}, La/do20;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    iget-object p0, p0, La/ts4;->k:La/do20;

    .line 27
    .line 28
    invoke-virtual {p0, p1, v1, p2, p3}, La/do20;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
