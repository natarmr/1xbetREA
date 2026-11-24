.class public final La/pzt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pke;


# direct methods
.method public constructor <init>(La/pke;)V
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
    iput-object p1, p0, La/pzt;->a:La/pke;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()La/h2c;
    .locals 2

    .line 1
    iget-object p0, p0, La/pzt;->a:La/pke;

    .line 2
    .line 3
    iget-object p0, p0, La/pke;->a:La/qke;

    .line 4
    .line 5
    iget-object p0, p0, La/qke;->a:La/p7m0;

    .line 6
    .line 7
    new-instance v0, La/h2c;

    .line 8
    .line 9
    const/16 v1, 0xc

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/h2c;-><init>(La/p7m0;B)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
