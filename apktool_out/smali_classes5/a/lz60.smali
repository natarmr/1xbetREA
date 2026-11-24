.class public abstract La/lz60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime La/ahi0;
    with = La/o2x;
.end annotation


# static fields
.field public static final Companion:La/iz60;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/iz60;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/lz60;->Companion:La/iz60;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p0, La/jz60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p0, ""

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, La/kz60;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, La/kz60;

    .line 13
    .line 14
    iget p0, p0, La/kz60;->a:I

    .line 15
    .line 16
    const-string v0, "_v"

    .line 17
    .line 18
    invoke-static {p0, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method
