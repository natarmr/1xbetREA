.class public final La/dvt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/wi9;


# direct methods
.method public constructor <init>(La/wi9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dvt;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/dvt;->b:La/wi9;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/dvt;->b:La/wi9;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()La/i89;
    .locals 2

    .line 1
    iget-byte v0, p0, La/dvt;->a:B

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    iget-object p0, p0, La/dvt;->b:La/wi9;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/wi9;->a:La/k3h0;

    .line 11
    .line 12
    iget-object p0, p0, La/k3h0;->b:La/p7m0;

    .line 13
    .line 14
    new-instance v0, La/i89;

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget-object p0, p0, La/wi9;->b:La/pc90;

    .line 21
    .line 22
    iget-object p0, p0, La/pc90;->a:La/p7m0;

    .line 23
    .line 24
    new-instance v0, La/i89;

    .line 25
    .line 26
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
