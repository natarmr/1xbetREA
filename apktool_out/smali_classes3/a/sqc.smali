.class public final La/sqc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mii0;


# direct methods
.method public synthetic constructor <init>(La/mii0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sqc;->a:La/mii0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/ov7;
    .locals 1

    .line 1
    sget-object v0, La/ott;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/sqc;->a:La/mii0;

    .line 13
    .line 14
    iget-object p0, p0, La/mii0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/t47;

    .line 17
    .line 18
    iget-object p0, p0, La/t47;->a:La/mv7;

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object p0

    .line 24
    :cond_1
    :goto_0
    sget-object p0, La/nv7;->a:La/nv7;

    .line 25
    .line 26
    return-object p0
.end method
