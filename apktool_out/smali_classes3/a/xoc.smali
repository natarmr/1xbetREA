.class public final La/xoc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jr0;


# direct methods
.method public constructor <init>(La/jr0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xoc;->a:La/jr0;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(La/jr0;Z)V
    .locals 0

    .line 10
    iput-object p1, p0, La/xoc;->a:La/jr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/xoc;->a:La/jr0;

    .line 2
    .line 3
    iget-object p0, p0, La/jr0;->b:La/ap0;

    .line 4
    .line 5
    iget-boolean p0, p0, La/ap0;->e:Z

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, ""

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    :goto_0
    const-string p0, "or"

    .line 16
    .line 17
    return-object p0
.end method
