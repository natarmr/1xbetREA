.class public final La/jut;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jr0;

.field public final b:La/j1q0;


# direct methods
.method public constructor <init>(La/jr0;La/j1q0;B)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p3, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/jut;->a:La/jr0;

    .line 11
    .line 12
    iput-object p2, p0, La/jut;->b:La/j1q0;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/jut;->a:La/jr0;

    .line 19
    .line 20
    iput-object p2, p0, La/jut;->b:La/j1q0;

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(JLjava/lang/String;Ljava/lang/String;ZZZ)La/k06;
    .locals 10

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/iut;

    .line 5
    .line 6
    const/4 v9, 0x0

    .line 7
    move-object v1, p0

    .line 8
    move-wide v2, p1

    .line 9
    move-object v5, p3

    .line 10
    move-object v6, p4

    .line 11
    move v7, p5

    .line 12
    move/from16 v4, p6

    .line 13
    .line 14
    move/from16 v8, p7

    .line 15
    .line 16
    invoke-direct/range {v0 .. v9}, La/iut;-><init>(La/jut;JZLjava/lang/String;Ljava/lang/String;ZZLa/yje;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, La/k06;

    .line 20
    .line 21
    new-instance p1, La/x860;

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    const/16 p3, 0x3c

    .line 25
    .line 26
    invoke-direct {p1, p3, p2}, La/x860;-><init>(IZ)V

    .line 27
    .line 28
    .line 29
    new-instance p2, La/l1;

    .line 30
    .line 31
    const/4 p3, 0x0

    .line 32
    const/16 p4, 0x11

    .line 33
    .line 34
    invoke-direct {p2, v0, p3, p4}, La/l1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, p1, p2}, La/k06;-><init>(La/x860;Lkotlin/jvm/functions/Function2;)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method
