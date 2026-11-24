.class public final La/n9s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/i9s;


# direct methods
.method public constructor <init>(La/i9s;)V
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
    iput-object p1, p0, La/n9s;->a:La/i9s;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()La/i89;
    .locals 2

    .line 1
    iget-object p0, p0, La/n9s;->a:La/i9s;

    .line 2
    .line 3
    iget-object p0, p0, La/i9s;->a:La/p7m0;

    .line 4
    .line 5
    new-instance v0, La/i89;

    .line 6
    .line 7
    const/16 v1, 0x16

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
