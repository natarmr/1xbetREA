.class public final La/mpt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mii0;


# direct methods
.method public synthetic constructor <init>(La/mii0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mpt;->a:La/mii0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/lt2;
    .locals 1

    .line 1
    iget-object p0, p0, La/mpt;->a:La/mii0;

    .line 2
    .line 3
    iget-object p0, p0, La/mii0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/t47;

    .line 6
    .line 7
    iget-object p0, p0, La/t47;->b:La/lt2;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    new-instance p0, La/lt2;

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    invoke-direct {p0, v0, v0}, La/lt2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object p0
.end method
