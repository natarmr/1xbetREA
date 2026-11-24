.class public final La/xyt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/uzc;


# direct methods
.method public synthetic constructor <init>(La/uzc;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/xyt;->a:La/uzc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 0

    .line 1
    iget-object p0, p0, La/xyt;->a:La/uzc;

    .line 2
    .line 3
    invoke-virtual {p0}, La/uzc;->b()La/jvn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, La/jvn;->getId()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
