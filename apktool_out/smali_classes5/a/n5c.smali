.class public final La/n5c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kd30;


# direct methods
.method public synthetic constructor <init>(La/kd30;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/n5c;->a:La/kd30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(La/n5c;La/swp0;La/obk0;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v3, 0x0

    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v5, p3

    .line 7
    move-object v6, p4

    .line 8
    invoke-virtual/range {v0 .. v6}, La/n5c;->a(La/swp0;La/obk0;IZLjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method


# virtual methods
.method public a(La/swp0;La/obk0;IZLjava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, La/obk0;->d:La/obk0;

    .line 2
    .line 3
    iget-object p0, p0, La/n5c;->a:La/kd30;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p6}, La/kd30;->e0(La/swp0;La/zje;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, La/obk0;->f:La/obk0;

    .line 13
    .line 14
    if-ne p2, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p6}, La/kd30;->T(La/swp0;La/zje;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object v0, La/obk0;->e:La/obk0;

    .line 22
    .line 23
    if-ne p2, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, p1, p6}, La/kd30;->U(La/swp0;La/zje;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_2
    if-eqz p4, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0, p6, p1, p5}, La/kd30;->X(La/zje;La/swp0;Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_3
    const/4 p2, 0x4

    .line 38
    if-eq p3, p2, :cond_4

    .line 39
    .line 40
    const/16 p2, 0x18

    .line 41
    .line 42
    if-eq p3, p2, :cond_4

    .line 43
    .line 44
    const/4 p2, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_4
    const/4 p2, 0x0

    .line 47
    :goto_0
    invoke-virtual {p0, p6, p1, p5, p2}, La/kd30;->W(La/zje;La/swp0;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method
