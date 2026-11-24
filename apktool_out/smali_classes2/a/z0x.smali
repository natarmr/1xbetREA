.class public final La/z0x;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dgu;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(La/dgu;Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z0x;->a:B

    iput-object p1, p0, La/z0x;->b:La/dgu;

    iput-object p2, p0, La/z0x;->c:Ljava/util/List;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/z0x;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/z0x;->c:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, La/z0x;->b:La/dgu;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/qb00;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/qb00;-><init>(La/dgu;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, La/qb00;

    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, La/qb00;-><init>(La/dgu;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/qb00;

    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, La/qb00;-><init>(La/dgu;Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
