.class public abstract La/z7k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:La/dvn;

.field public final b:Ljava/lang/Object;

.field public final c:La/nek;


# direct methods
.method public constructor <init>(La/dvn;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z7k0;->a:La/dvn;

    .line 5
    .line 6
    new-instance p1, La/nek;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/z7k0;->c:La/nek;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/z7k0;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
