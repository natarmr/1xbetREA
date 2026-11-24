.class public final synthetic La/ut2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/agk0;

.field public final synthetic c:La/rv2;


# direct methods
.method public synthetic constructor <init>(La/agk0;La/rv2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ut2;->a:B

    iput-object p1, p0, La/ut2;->b:La/agk0;

    iput-object p2, p0, La/ut2;->c:La/rv2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ut2;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ut2;->c:La/rv2;

    .line 4
    .line 5
    iget-object p0, p0, La/ut2;->b:La/agk0;

    .line 6
    .line 7
    check-cast p1, La/lwk;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p1, La/ku2;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, v1, v0}, La/ku2;-><init>(La/agk0;La/rv2;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    new-instance p1, La/ku2;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, v1, v0}, La/ku2;-><init>(La/agk0;La/rv2;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_1
    new-instance p1, La/ku2;

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-direct {p1, p0, v1, v0}, La/ku2;-><init>(La/agk0;La/rv2;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_2
    new-instance p1, La/ku2;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-direct {p1, p0, v1, v0}, La/ku2;-><init>(La/agk0;La/rv2;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
