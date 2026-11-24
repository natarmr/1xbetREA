.class public final La/qbu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/l3z;


# direct methods
.method public constructor <init>(La/l3z;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/qbu;->a:La/l3z;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/qbu;->a:La/l3z;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()La/i89;
    .locals 2

    .line 1
    iget-object p0, p0, La/qbu;->a:La/l3z;

    .line 2
    .line 3
    iget-object p0, p0, La/l3z;->a:La/mws;

    .line 4
    .line 5
    iget-object p0, p0, La/mws;->a:La/p7m0;

    .line 6
    .line 7
    new-instance v0, La/i89;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public b(La/fsr;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/qbu;->a:La/l3z;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/l3z;->a:La/mws;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/mws;->a:La/p7m0;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method
